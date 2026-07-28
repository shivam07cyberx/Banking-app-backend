package com.bank.cash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.response.AccountTypeResponseDTO;
import com.bank.cash.entity.AccountType;
import com.bank.cash.repository.IAccountTypeRepository;


@Service
public  class AccountTypeServiceImp implements AccountTypeService {

	@Autowired
private 	IAccountTypeRepository accountTypeRepo;

	@Override
	public AccountTypeResponseDTO addAccountType(AccountTypeRequestDTO accountTypeDtp) {
		return null;
	}
	
	

}
