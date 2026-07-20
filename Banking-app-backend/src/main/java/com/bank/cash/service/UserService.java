package com.bank.cash.service;

import java.util.List;

import com.bank.cash.dto.UserDTO;

public interface UserService  {

	UserDTO addUser(UserDTO user);
	List<UserDTO> viewAllUser();
}
