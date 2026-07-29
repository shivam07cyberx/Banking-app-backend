package com.bank.cash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.cash.entity.Account;
import com.bank.cash.entity.AccountType;

public interface IAccountRepository extends JpaRepository<Account, Long> {

}
