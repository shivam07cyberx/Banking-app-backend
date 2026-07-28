package com.bank.cash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.entity.Account;
import com.bank.cash.repository.IAccountRepository;

@Service
public class AccountServiceImp implements AccountService{
	
	@Autowired
	IAccountRepository accountRepository;

	@Override
	public Account OpenAccount(Account acccount) {
		
		
		
		return accountRepository.save(acccount);
	}

}
