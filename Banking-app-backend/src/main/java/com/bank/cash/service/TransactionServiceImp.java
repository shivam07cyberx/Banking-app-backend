package com.bank.cash.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.TransferRequestDTO;
import com.bank.cash.dto.response.TransactionResponseDTO;
import com.bank.cash.entity.Account;
import com.bank.cash.entity.Transaction;
import com.bank.cash.enums.TransactionType;
import com.bank.cash.exception.InsufficientBalanceException;
import com.bank.cash.exception.UserNotFoundException;
import com.bank.cash.repository.IAccountRepository;
import com.bank.cash.repository.ITransactionRepository;
import com.bank.cash.repository.IUserRepository;

import jakarta.transaction.Transactional;
@Service
public class TransactionServiceImp implements TransactionService{

	@Autowired
	ITransactionRepository transactionRepository;
	
	@Autowired
	IAccountRepository accountRepository;
	
	@Autowired
	IUserRepository userReposiotry;

	@Override
	@Transactional
	public TransactionResponseDTO transferMoney(TransferRequestDTO transferRequestDto) {
		
		
		Account fromAccount =accountRepository.findById(transferRequestDto.getFromAccount()).orElseThrow(()-> new UserNotFoundException("user Not present with this account no.! "+transferRequestDto.getFromAccount()));
		Account toAccount =accountRepository.findById(transferRequestDto.getToAccount()).orElseThrow(()-> new UserNotFoundException("user Not present with this account no.! "+transferRequestDto.getToAccount()));

		Transaction transaction=null;
		
		if(fromAccount.getBalance()>transferRequestDto.getAmount()) {
		//begin treasication
			
			double senderBalance= fromAccount.getBalance()-transferRequestDto.getAmount();
			fromAccount.setBalance(senderBalance);
			double recieverBalance=toAccount.getBalance()+transferRequestDto.getAmount();
			toAccount.setBalance(recieverBalance);
	 transaction =new Transaction(TransactionType.TRANSFER, transferRequestDto.getAmount(), toAccount);
		transaction.setFromAccount(fromAccount);
		
		accountRepository.save(fromAccount);
			accountRepository.save(toAccount);
			transactionRepository.save(transaction);
			
			
			
		}else {
			
			throw new InsufficientBalanceException("low balance in sender account");
		}
		
		
		TransactionResponseDTO transactionResponse= new TransactionResponseDTO(TransactionType.TRANSFER, transferRequestDto.getAmount(), transferRequestDto.getFromAccount(),transferRequestDto.getToAccount() , LocalDateTime.now());
		
		return transactionResponse;
	}
	


}
