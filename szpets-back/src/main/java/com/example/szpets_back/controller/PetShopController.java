package com.example.szpets_back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.szpets_back.entities.DTOPetShop;
import com.example.szpets_back.entities.DTOReturn;
import com.example.szpets_back.service.DataService;
import com.example.szpets_back.service.PetShopService;


@RestController
@RequestMapping("/petshop")
public class PetShopController {

    @Autowired
    private PetShopService petShopService;

    @Autowired
    private DataService dataService;

    @PostMapping("/bestPetShop")
    public ResponseEntity<DTOReturn> getBestPetShop(@RequestBody DTOPetShop date) {
        return ResponseEntity.ok().body(petShopService.findBestPetShop(date.smallDogs(), date.largeDogs(), dataService.isWeekend(date.date())));
    }
}
