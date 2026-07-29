package com.bank.cash.service;


import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.TransferRequestDTO;
import com.bank.cash.dto.response.TransactionResponseDTO;

@Service
public interface TransactionService {
	


	public TransactionResponseDTO transferMoney(TransferRequestDTO transferRequestDto );
	
}
