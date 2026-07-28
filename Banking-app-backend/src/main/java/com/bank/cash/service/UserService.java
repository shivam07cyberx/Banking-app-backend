package com.bank.cash.service;

import com.bank.cash.dto.request.UserRequestDTO;
import com.bank.cash.dto.response.UserResponseDTO;
import com.bank.cash.entity.User;

public interface UserService  {

	public UserResponseDTO registerUser(UserRequestDTO user);
	
	public UserResponseDTO findUserById(Long id);
	
//	public UserResponseDTO UpdateUser(Long id, UserRequestDTO userRes);
	
	
	public User findUserEntityById(Long id);
	
	

}
