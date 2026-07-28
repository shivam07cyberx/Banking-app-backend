package com.bank.cash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.entity.Transaction;
import com.bank.cash.repository.ITransactionRepository;
@Service
public class TransactionServiceImp implements TransactionService{

	@Autowired
	ITransactionRepository transactionRepository;
	
	@Override
	public Transaction createTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}

}
