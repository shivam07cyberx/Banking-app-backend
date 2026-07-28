package com.bank.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.request.UserRequestDTO;
import com.bank.cash.dto.response.UserResponseDTO;
import com.bank.cash.entity.Account;
import com.bank.cash.exception.UserNotFoundException;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private  UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<ApiResponse> addUser(@Valid @RequestBody UserRequestDTO requestDto){
		
		
		UserResponseDTO responseDto= userService.registerUser(requestDto);
		
		ApiResponse success= new SuccessResponse<UserResponseDTO>(HttpStatus.CREATED.value(), true, responseDto);
		
		
		
		return new ResponseEntity<>(success,HttpStatus.CREATED);
		
		
	
	}
	
	@GetMapping("/show/{id}")
	public UserResponseDTO getUser(@PathVariable Long id) {
		UserResponseDTO udto=null;
		
		
		 udto	=   userService.findUserById(id);
		

		
		return udto;
	}
	
	
	
	
}
