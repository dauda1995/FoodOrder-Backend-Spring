package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Delivery;
import com.example.demo.model.Products;
import com.example.demo.service.DeliveryService;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliverController {
    

    @Autowired
    DeliveryService deliveryService;

    // @GetMapping("/product/")
    // private List<Products> getAllProductSelected(@RequestBody Products productsMaker){
    //     List<Products> selected = new ArrayList<>();
    //     List<Products> allList = productService.getAllProducts();
    //     for(Products p: allList){
    //         if(p.getMaker().equals(productsMaker.getMaker())){
    //             selected.add(p);
    //         }
    //     }
    //     return selected;
    // }

    @GetMapping("/delivery")
    private List<Delivery> getAllDelivery(){
        return deliveryService.getAllDelivery();
    }

    @GetMapping("/delivery/{id}")
    private Delivery getDeliveryById(@PathVariable("id") int id){
        return deliveryService.getDeliveryById(id);
    }

    @DeleteMapping("delivery/{id}")
    private void deleteDelivery(@PathVariable("id") int id){
        deliveryService.delete(id);
    }

    @PostMapping("/delivery")
    private int saveDelivery(@RequestBody Delivery product){
        deliveryService.saveOrUpdate(product);
        return product.getId();
    }
   

}


