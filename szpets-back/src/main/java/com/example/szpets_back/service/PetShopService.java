package com.example.szpets_back.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.szpets_back.entities.DTOReturn;
import com.example.szpets_back.entities.PetShop;
import com.example.szpets_back.repositories.PetShopRepository;

@Service
public class PetShopService {

    @Autowired
    private PetShopRepository repository;
    
    /**
     * Encontra o melhor pet shop baseado nos parâmetros fornecidos.
     *
     * @param smallDogs  Número de cães pequenos.
     * @param largeDogs  Número de cães grandes.
     * @param isWeekend  Indicador se é fim de semana (true) ou dia de semana (false).
     * @return           Objeto DTO contendo o nome, distância e custo total do melhor pet shop.
     */
    public DTOReturn findBestPetShop(int smallDogs, int largeDogs, boolean isWeekend) {
        List<PetShop> petShops = repository.findAll();

        PetShop bestPetShop = petShops.stream()
                .min(Comparator.comparingDouble((PetShop petShop) -> calculateTotalCost(petShop, smallDogs, largeDogs, isWeekend))
                        .thenComparingDouble(PetShop::getDistanceFromKennel))
                .orElse(null);

        double totalCost = calculateTotalCost(bestPetShop, smallDogs, largeDogs, isWeekend);

        return new DTOReturn(bestPetShop.getName(), bestPetShop.getDistanceFromKennel(), totalCost);
    }

    /**
     * Calcula o custo total para um pet shop baseado no número de cães pequenos e grandes e no tipo de dia.
     *
     * @param petShop    O pet shop para o qual calcular o custo total.
     * @param smallDogs  Número de cães pequenos.
     * @param largeDogs  Número de cães grandes.
     * @param isWeekend  Indicador se é fim de semana (true) ou dia de semana (false).
     * @return           Custo total para o pet shop e quantidades de cães fornecidos.
     */
    private double calculateTotalCost(PetShop petShop, int smallDogs, int largeDogs, boolean isWeekend) {
        double smallDogPrice = isWeekend ? petShop.getWeekendSmallDogPrice() : petShop.getWeekdaySmallDogPrice();
        double largeDogPrice = isWeekend ? petShop.getWeekendLargeDogPrice() : petShop.getWeekdayLargeDogPrice();
        return smallDogs * smallDogPrice + largeDogs * largeDogPrice;
    }
}
