package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Seller;
import com.example.demo.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @Autowired
    SellerService sellerService;

    @GetMapping("/seller")
    private List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
    }

    @GetMapping("/seller/{id}")
    private Seller getSeller(@PathVariable("id") String id){
        return sellerService.getSellerById(id);
    }

    @DeleteMapping("/seller/{id}")
    private void deleteSeller(@PathVariable("id") String id){
        sellerService.delete(id);
    }

    @GetMapping("/seller/{user}")
    private Boolean findByEmail(@PathVariable("user") String email){
        Boolean ans = false;
        List<Seller> sellers = getAllSellers();
        for(Seller e: sellers) {
           if(email == e.getEmail()){
               ans = true;
           }
        };
        return ans;
    }

    @PostMapping("/register")
    private String saveSeller(@RequestBody Seller seller){
        sellerService.saveOrUpdate(seller);
        return seller.getId();
    }

   
}
