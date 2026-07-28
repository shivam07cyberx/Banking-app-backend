package com.bank.cash.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
	
	
	private int status;
	
	private Boolean success;
	
	private LocalDateTime timestamp;

	public ApiResponse() {
		super();
		this.timestamp = LocalDateTime.now();
	}

	public ApiResponse(int status, Boolean success) {
		super();
		this.status = status;
		this.success = success;
		this.timestamp = LocalDateTime.now();
	}
	
	
	
	

}
