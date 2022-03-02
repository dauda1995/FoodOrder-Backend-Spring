package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.SellerRepository;
import com.example.demo.model.Products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

    public List<Products> getAllProducts(){

        List<Products> products = new ArrayList<Products>();
        productRepo.findAll().forEach(product -> products.add(product));

        return products;
    }

    public Products getProductById(int id){
        return productRepo.findById(id).get();
    }

    public void saveOrUpdate(Products product){
        productRepo.save(product);
    }

    public void delete(int id){
        productRepo.deleteById(id);
    }



}
