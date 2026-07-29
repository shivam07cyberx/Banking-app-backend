package com.bank.cash.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.AccountRequestDTO;
import com.bank.cash.dto.response.AccountResponseDTO;
import com.bank.cash.entity.Account;
import com.bank.cash.entity.AccountType;
import com.bank.cash.entity.Address;
import com.bank.cash.entity.Transaction;
import com.bank.cash.entity.User;
import com.bank.cash.enums.TransactionType;
import com.bank.cash.enums.TypeName;
import com.bank.cash.exception.UserNotFoundException;
import com.bank.cash.repository.IAccountRepository;
import com.bank.cash.repository.IAccountTypeRepository;
import com.bank.cash.repository.ITransactionRepository;
import com.bank.cash.repository.IUserRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountServiceImp implements AccountService{
	
	@Autowired
	 private IAccountRepository accountRepository;
	
	@Autowired
	private  IUserRepository userRepository;
	
	@Autowired
	private  IAccountTypeRepository accountTypeRepository;
	
	@Autowired
	 private ITransactionRepository transactionRepository;
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public AccountResponseDTO OpenAccount(AccountRequestDTO accountRequestDto) {
		
		
		Long id=accountRequestDto.getUserId();
		
		Account account=null;
		
	User user=	userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("user not exhist!"));
		
		TypeName type= accountRequestDto.getAccountType();
		
	
			
		
			Address address=user.getAddress();
			

			
			AccountType accountType=accountTypeRepository.findByTypeName(accountRequestDto.getAccountType());
		
			
			 account =new Account(accountRequestDto.getBalance(), address.getCity(), address.getState()+"8989", user, accountType);
			
			
			account.setAccountType(accountType);
			
			Transaction transaction= new Transaction(TransactionType.DEPOSIT,account.getBalance(), account);
			
			accountRepository.save(account);
			transactionRepository.save(transaction);
			accountTypeRepository.save(accountType);
			
			
		return modelMapper.map(account, AccountResponseDTO.class);
		
		
	}


	
	

}
