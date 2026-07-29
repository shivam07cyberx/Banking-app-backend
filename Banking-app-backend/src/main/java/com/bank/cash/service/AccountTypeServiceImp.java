package com.bank.cash.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.response.AccountTypeResponseDTO;
import com.bank.cash.entity.AccountType;
import com.bank.cash.enums.TypeName;
import com.bank.cash.repository.IAccountTypeRepository;


@Service
public  class AccountTypeServiceImp implements AccountTypeService {

	@Autowired
private 	IAccountTypeRepository accountTypeRepo;
	
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public AccountTypeResponseDTO addAccountType(AccountTypeRequestDTO accountTypeDto) {
		
		
		accountTypeRepo.save(modelMapper.map(accountTypeDto, AccountType.class));
		return modelMapper.map(accountTypeDto, AccountTypeResponseDTO.class);
	}


	@Override
	public AccountType findAccountTypeByType(TypeName typeName) {
		// TODO Auto-generated method stub
		
		AccountType accountType= accountTypeRepo.findByTypeName(typeName);
		
		
		return accountType;
	}
	
	

}
