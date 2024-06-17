package com.example.szpets_back.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.szpets_back.entities.PetShop;
import com.example.szpets_back.repositories.PetShopRepository;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(PetShopRepository repository) {
        return args -> {
            repository.save(new PetShop("Meu Canino Feliz", 2.0, 20.0, 40.0, 0.2));
            repository.save(new PetShop("Vai Rex", 1.7, 15.0, 50.0, 20.0, 55.0));
            repository.save(new PetShop("ChowChawgas", 0.8, 30.0, 45.0));
        };
    }
}