package com.bank.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.UserDTO;
import com.bank.cash.entity.Account;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<ApiResponse> addUser(@Valid @RequestBody UserDTO userDto){
		
		UserDTO user= userService.addUser(userDto);
		
		user.setAccountType(userDto.getAccountType());
		
		
		
	    SuccessResponse<UserDTO> response =
                new SuccessResponse<>(
                        HttpStatus.CREATED.value(),
                        "User created successfully",
                        user
                );
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);

	}
}
