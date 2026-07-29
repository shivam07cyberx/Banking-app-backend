package com.bank.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.response.AccountTypeResponseDTO;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.AccountTypeService;

@RestController
@RequestMapping("account_type")
public class AccountTypeController {
	
	@Autowired
	AccountTypeService accountTypeService;
	
	
	@PostMapping("/add_type")
	public ResponseEntity<ApiResponse> addAccountType(@RequestBody AccountTypeRequestDTO accountTypeRequest){
		
		ApiResponse success= new SuccessResponse<AccountTypeResponseDTO>(HttpStatus.CREATED.value(), true, accountTypeService.addAccountType(accountTypeRequest));
		
		
		return new ResponseEntity<ApiResponse>(success,HttpStatus.CREATED);
	}

}
