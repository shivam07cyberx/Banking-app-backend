package com.bank.cash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.entity.User;
import com.bank.cash.repository.IUserRepository;

@Service
public class UserServiceImp {

	
	@Autowired
	IUserRepository userRepo;
	
	
	public User add(User user) {
		
		return userRepo.save(user);
		
	}
	
	
}
