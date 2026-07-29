package com.bank.cash.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.request.AddressRequestDTO;
import com.bank.cash.dto.response.AddressResponseDTO;
import com.bank.cash.entity.Address;
import com.bank.cash.entity.User;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.AddressService;
import com.bank.cash.service.UserService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	
	private AddressService addressServ;
	

	
	@PostMapping("/add/{id}")
	public ResponseEntity<ApiResponse> addAddress( @PathVariable Long id,@RequestBody AddressRequestDTO addressRequest ){
		
		
		AddressResponseDTO response= addressServ.addAddress(id,addressRequest);
		
		
		ApiResponse success= new SuccessResponse<>(HttpStatus.CREATED.value(), true, response);
		
		
		return new  ResponseEntity<ApiResponse>(success,HttpStatus.CREATED);
	}
	
	
	

}
