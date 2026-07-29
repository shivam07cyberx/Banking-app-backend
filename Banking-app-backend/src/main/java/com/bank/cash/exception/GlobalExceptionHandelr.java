package com.bank.cash.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bank.cash.response.ApiResponse;
import com.bank.cash.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandelr {
	
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<ApiResponse> duplicateEmailException(DuplicateEmailException ex) {
		
		ApiResponse error= new ErrorResponse<String>(HttpStatus.CONFLICT.value(), false, ex.getMessage());
		
		
		return new ResponseEntity<ApiResponse>(error,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ApiResponse> userNotFoundException (UserNotFoundException ex){
		
		ApiResponse error = new ErrorResponse<String>(HttpStatus.NOT_FOUND.value(),false ,ex.getMessage());
		
		return new ResponseEntity<ApiResponse>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ApiResponse> userNotFoundException (InsufficientBalanceException ex){
		
		ApiResponse error = new ErrorResponse<String>(HttpStatus.UNPROCESSABLE_CONTENT.value(),false ,ex.getMessage());
		
		return new ResponseEntity<ApiResponse>(error,HttpStatus.UNPROCESSABLE_CONTENT);
		
	}
	

}
