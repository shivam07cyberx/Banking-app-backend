package com.bank.cash.dto.response;

import com.bank.cash.entity.AccountType;
import com.bank.cash.enums.Role;

import lombok.Data;

@Data
public class UserResponseDTO {

    private Long id;

    private String userFullName;

    private String mobile;

    private String email;
    
    private AccountType accountType;

    private Role role;
}