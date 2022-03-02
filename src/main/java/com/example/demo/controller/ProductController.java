package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Products;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

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

    @GetMapping("/product")
    private List<Products> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    private Products getProduct(@PathVariable("id") int id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/product/{id}")
    private void deleteProduct(@PathVariable("id") int id){
        productService.delete(id);
    }

    @PostMapping("/product")
    private int saveProduct(@RequestBody Products product){
        productService.saveOrUpdate(product);
        return product.getId();
    }
   

}
