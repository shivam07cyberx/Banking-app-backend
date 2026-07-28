package com.bank.cash.service;

import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.response.AccountTypeResponseDTO;
import com.bank.cash.entity.AccountType;

public interface AccountTypeService {
	
	public AccountTypeResponseDTO addAccountType(AccountTypeRequestDTO accountTypeDtp);

}
