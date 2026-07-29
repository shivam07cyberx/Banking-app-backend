package com.bank.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cash.dto.request.TransferRequestDTO;
import com.bank.cash.dto.response.TransactionResponseDTO;
import com.bank.cash.entity.Transaction;
import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.SuccessResponse;
import com.bank.cash.service.TransactionService;

@RestController
@RequestMapping("/transfer")
public class TransactionController {
	
	@Autowired
	TransactionService transectionService;
	
	@PostMapping("/send")
	public ResponseEntity<ApiResponse> trennsferMoney(@RequestBody TransferRequestDTO transferRequestDto){
		
	 TransactionResponseDTO transaction=	transectionService.transferMoney(transferRequestDto);
		
	ApiResponse success= new SuccessResponse<	 TransactionResponseDTO>(HttpStatus.OK.value(),true , transaction);
	
	return new ResponseEntity<ApiResponse>(success,HttpStatus.OK);
		
		
	}

}
