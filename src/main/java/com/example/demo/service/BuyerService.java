package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Repository.BuyerRepository;
import com.example.demo.model.Buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    @Autowired
    BuyerRepository buyerRepo;

    public Buyer getBuyer(int id){
       return buyerRepo.findById(id).get();
    }

    public void saveOrUpdate(Buyer buyer){
        buyerRepo.save(buyer);
    }

    public List<Buyer> getAllBuyers(){
        List<Buyer> buyers = new ArrayList<>();
        buyerRepo.findAll().forEach(buyr -> buyers.add(buyr));
        return buyers;
    }
    
}
