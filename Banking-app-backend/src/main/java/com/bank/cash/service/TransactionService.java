package com.bank.cash.service;


import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.AccountRequestDTO;
import com.bank.cash.dto.request.DepositRequestDTO;
import com.bank.cash.dto.request.TransferRequestDTO;
import com.bank.cash.dto.request.WithdrawRequestDTO;
import com.bank.cash.dto.response.AccountResponseDTO;
import com.bank.cash.dto.response.TransactionResponseDTO;

@Service
public interface TransactionService {
	


	public TransactionResponseDTO transferMoney(TransferRequestDTO transferRequestDto);
	
	
	public AccountResponseDTO depositeMoney(DepositRequestDTO depositeRequest);
	public AccountResponseDTO withDrawMoney(WithdrawRequestDTO withdrawRequestDto);

	
	
	
}
