package com.bank.cash.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponse <T> extends ApiResponse {

	
private T date;

public SuccessResponse(int status, String message,T date) {
	super(status, message);
	this.date = date;
}	




	
	
}
