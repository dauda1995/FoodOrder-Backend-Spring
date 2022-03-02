package com.example.demo.Repository;

import com.example.demo.dto.InitializeTransactionRequestDTO;
import com.example.demo.dto.InitializeTransactionResponseDTO;

public interface InitializeTransactionService {
    InitializeTransactionResponseDTO initializeTransaction(
            InitializeTransactionRequestDTO initializeTransactionRequestDTO);
}
