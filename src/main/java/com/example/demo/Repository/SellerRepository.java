package com.example.demo.Repository;

import com.example.demo.model.Seller;

import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Integer> {
    
}
