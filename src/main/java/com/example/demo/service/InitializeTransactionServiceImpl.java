package com.example.demo.service;

import com.example.demo.Repository.InitializeTransactionService;
import com.example.demo.dto.InitializeTransactionRequestDTO;
import com.example.demo.dto.InitializeTransactionResponseDTO;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InitializeTransactionServiceImpl implements InitializeTransactionService {
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public InitializeTransactionResponseDTO initializeTransaction(
            InitializeTransactionRequestDTO initializeTransactionRequestDTO) {
        // TODO Auto-generated method stub
        String url = "https://api.paystack.co/transaction/initialize";

        HttpHeaders headers = new HttpHeaders();

        String key = "sk_test_446b2929ad63c551872785216610952472e2de8f";

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + key);

        HttpEntity<InitializeTransactionRequestDTO> entity = new HttpEntity<InitializeTransactionRequestDTO>(
                initializeTransactionRequestDTO, headers);

        ResponseEntity<InitializeTransactionResponseDTO> response = restTemplate.postForEntity(url, entity,
                InitializeTransactionResponseDTO.class);

        return response.getBody();

    }
}