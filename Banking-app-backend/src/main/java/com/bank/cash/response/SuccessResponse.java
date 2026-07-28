package com.bank.cash.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponse <T> extends ApiResponse {

	
private T data;

public SuccessResponse(int status, Boolean success,T data) {
	super(status, success);
	this.data = data;
}	




	
	
}
