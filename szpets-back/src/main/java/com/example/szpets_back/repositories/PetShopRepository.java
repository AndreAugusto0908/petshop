package com.example.szpets_back.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.szpets_back.entities.PetShop;




@Repository
public interface PetShopRepository extends JpaRepository<PetShop, String> {
}
