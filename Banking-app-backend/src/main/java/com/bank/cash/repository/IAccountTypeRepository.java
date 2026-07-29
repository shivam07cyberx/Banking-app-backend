package com.bank.cash.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bank.cash.entity.AccountType;
import com.bank.cash.enums.TypeName;
import java.util.List;


public interface IAccountTypeRepository extends JpaRepository<AccountType, Long> {
	
	
	public AccountType  findByTypeName(TypeName typeName);

}
