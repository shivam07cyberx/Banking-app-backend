package com.bank.cash.service;

import org.modelmapper.ModelMapper;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.UserRequestDTO;
import com.bank.cash.dto.response.UserResponseDTO;
import com.bank.cash.entity.User;
import com.bank.cash.enums.Role;
import com.bank.cash.exception.DuplicateEmailException;
import com.bank.cash.exception.UserNotFoundException;
import com.bank.cash.repository.IUserRepository;

@Service
public class UserServiceImp implements UserService {

	
	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserResponseDTO registerUser(UserRequestDTO requestDto) {
		
		User user= modelMapper.map(requestDto, User.class);
		user.setUserFullName(user.getUserFullName().toUpperCase());
		user.setRole(Role.CUSTOMER);
		User savedUser=null;
		try {
	 savedUser	= userRepo.save(user);
		}catch(DataIntegrityViolationException ex) {
			
			throw new DuplicateEmailException("email is already present");
		}
		
		
		return modelMapper.map(savedUser,UserResponseDTO.class);
	}

	@Override
	public UserResponseDTO findUserById(Long Id) {
	
		User user=
		userRepo.findById(Id).orElseThrow(()-> new UserNotFoundException("user not exhist"));
		
		UserResponseDTO response= modelMapper.map(user, UserResponseDTO.class);
		
		
		
		return response ;
	}

	@Override
	public User findUserEntityById(Long id) {
		// TODO Auto-generated method stub
		
		
		User user= userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user not found"));
		
		
		
		return user;
	}

	
	
	
	
//	@Override
//	public UserResponseDTO UpdateUser(Long id, UserRequestDTO userReq) {
//	
//		
//		User user=userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user not preset"));
//		
//		
//		
//		
//		
//		
//		
//		
//	}



	
	
}
