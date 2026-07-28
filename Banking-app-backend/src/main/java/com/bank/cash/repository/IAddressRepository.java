package com.bank.cash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.cash.entity.Address;

public interface IAddressRepository extends JpaRepository<Address, Long> {

}
