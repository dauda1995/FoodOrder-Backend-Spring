package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Repository.DeliveryRepository;
import com.example.demo.model.Delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    

    @Autowired
    DeliveryRepository deliveryRepo;

    public List<Delivery> getAllDelivery(){

        List<Delivery> deliver = new ArrayList<Delivery>();
        deliveryRepo.findAll().forEach(e -> deliver.add(e));
        return deliver;
    }

    public Delivery getDeliveryById(int id){
        return deliveryRepo.findById(id).get();
    }

    public void saveOrUpdate(Delivery product){
        deliveryRepo.save(product);
    }

    public void delete(int id){
        deliveryRepo.deleteById(id);
    }
}
