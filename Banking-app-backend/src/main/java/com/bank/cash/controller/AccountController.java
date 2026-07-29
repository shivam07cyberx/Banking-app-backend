package com.bank.cash.controller;

import java.util.List;



import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.request.AccountRequestDTO;
import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.request.UserRequestDTO;
import com.bank.cash.dto.response.AccountResponseDTO;
import com.bank.cash.dto.response.UserResponseDTO;
import com.bank.cash.entity.Account;
import com.bank.cash.entity.User;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.AccountService;
import com.bank.cash.service.UserService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/open")
	
	public ResponseEntity<ApiResponse> openAccount(@RequestBody AccountRequestDTO accountTypeDto){
		
		
		AccountResponseDTO response=  accountService.OpenAccount(accountTypeDto);
		
		
	    ApiResponse successRespone= new SuccessResponse<AccountResponseDTO>(HttpStatus.CREATED.value(), true,response);
		
		return new ResponseEntity<ApiResponse>(successRespone,HttpStatus.CREATED);
	}
	

}
