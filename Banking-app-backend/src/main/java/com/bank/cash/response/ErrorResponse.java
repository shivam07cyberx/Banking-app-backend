package com.bank.cash.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse<T> extends ApiResponse {

	
	
	
	private String errors;

	public ErrorResponse(int status, Boolean message, String errors) {
		super(status, message);
		this.errors=errors;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
