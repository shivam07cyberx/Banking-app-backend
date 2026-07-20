package com.bank.cash.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse<T> extends ApiResponse {

	
	
	
	private List<String> errors;

	public ErrorResponse(int status, String message, List<String> errors) {
		super(status, message);
		this.errors=errors;;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
