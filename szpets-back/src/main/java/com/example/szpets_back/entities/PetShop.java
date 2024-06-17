package com.example.szpets_back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PetShop {
    @Id
    private String name;
    private double distanceFromKennel;
    private double weekdaySmallDogPrice;
    private double weekdayLargeDogPrice;
    private double porcentagem;
    private double weekendSmallDogPrice;
    private double weekendLargeDogPrice;

    public PetShop() {
    }

    public PetShop(String name, double distanceFromKennel, double weekdaySmallDogPrice, double weekdayLargeDogPrice, double porcentagem) {
        this.name = name;
        this.distanceFromKennel = distanceFromKennel;
        this.weekdaySmallDogPrice = weekdaySmallDogPrice;
        this.weekdayLargeDogPrice = weekdayLargeDogPrice;
        this.weekendSmallDogPrice = weekdaySmallDogPrice + (weekdaySmallDogPrice * porcentagem);
        this.weekendLargeDogPrice = weekdayLargeDogPrice + (weekdayLargeDogPrice * porcentagem);
    }

    public PetShop(String name, double distanceFromKennel, double weekdaySmallDogPrice, double weekdayLargeDogPrice, double weekendSmallDogPrice, double weekendLargeDogPrice)  {
        this.name = name;
        this.distanceFromKennel = distanceFromKennel;
        this.weekdaySmallDogPrice = weekdaySmallDogPrice;
        this.weekdayLargeDogPrice = weekdayLargeDogPrice;
        this.weekendSmallDogPrice = weekendSmallDogPrice;
        this.weekendLargeDogPrice = weekendLargeDogPrice;
    }

    public PetShop(String name, double distanceFromKennel, double weekdaySmallDogPrice, double weekdayLargeDogPrice) {  
        this.name = name;
        this.distanceFromKennel = distanceFromKennel;
        this.weekdaySmallDogPrice = weekdaySmallDogPrice;
        this.weekdayLargeDogPrice = weekdayLargeDogPrice;
        this.weekendSmallDogPrice = weekdaySmallDogPrice;
        this.weekendLargeDogPrice = weekdayLargeDogPrice;
    }


}

