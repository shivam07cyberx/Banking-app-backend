package com.bank.cash.service;

import com.bank.cash.dto.request.AccountTypeRequestDTO;
import com.bank.cash.dto.response.AccountTypeResponseDTO;
import com.bank.cash.entity.AccountType;
import com.bank.cash.enums.TypeName;

public interface AccountTypeService {
	
	public AccountTypeResponseDTO addAccountType(AccountTypeRequestDTO accountTypeDtp);
	
	public AccountType findAccountTypeByType(TypeName typeName);

}
