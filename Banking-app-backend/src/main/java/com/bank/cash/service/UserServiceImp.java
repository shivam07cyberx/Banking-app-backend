package com.bank.cash.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.UserDTO;
import com.bank.cash.entity.User;
import com.bank.cash.repository.IUserRepository;

@Service
public class UserServiceImp implements UserService {

	
	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private ModelMapper modelMapper;


	@Override
	public UserDTO addUser(UserDTO userDto) {
		
		User user=modelMapper.map(userDto, User.class);
		User savedUser= userRepo.save(user);
		
		
		
		
		return modelMapper.map(savedUser,UserDTO.class);
		
		
		
		
		
		
	}


	@Override
	public List<UserDTO> viewAllUser() {
		// TODO Auto-generated method stub
	
		List<User> users=userRepo.findAll();
		
		List<UserDTO> userDTOs=users.stream().map(user->modelMapper.map(user, UserDTO.class)).toList();
		
		
		return userDTOs ;
	}
	
	
}
