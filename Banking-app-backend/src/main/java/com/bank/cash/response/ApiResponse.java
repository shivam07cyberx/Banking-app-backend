package com.bank.cash.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
	
	
	private int status;
	
	private String message;
	
	private LocalDateTime timestamp;

	public ApiResponse() {
		super();
		this.timestamp = LocalDateTime.now();
	}

	public ApiResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = LocalDateTime.now();
	}
	
	
	
	

}
