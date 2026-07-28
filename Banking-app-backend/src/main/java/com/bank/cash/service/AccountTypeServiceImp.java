package com.bank.cash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.entity.AccountType;
import com.bank.cash.repository.IAccountTypeRepository;


@Service
public class AccountTypeServiceImp implements AccountTypeService {

	@Autowired
private 	IAccountTypeRepository accountTypeRepo;
	@Override
	public AccountType addAccountType(AccountType accountType) {
		// TODO Auto-generated method stub
		return accountTypeRepo.save(accountType) ;
	}

}
