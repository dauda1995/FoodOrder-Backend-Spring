package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Repository.SellerRepository;
import com.example.demo.model.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepo;

    public List<Seller> getAllSellers(){

        List<Seller> sellers = new ArrayList<Seller>();
        sellerRepo.findAll().forEach(seller -> sellers.add(seller));

        return sellers;
    }

    public Seller getSellerById(String id){
        return sellerRepo.findById(Integer.parseInt(id)).get();
    }

    public void saveOrUpdate(Seller seller){
        sellerRepo.save(seller);
    }

    public void delete(String id){
        sellerRepo.deleteById(Integer.parseInt(id));
    }

}
