package com.example.demo;

import com.example.demo.model.Products;
import com.example.demo.model.Seller;
import com.example.demo.service.ProductService;
import com.example.demo.service.SellerService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAppApplication.class, args);
	}


}
