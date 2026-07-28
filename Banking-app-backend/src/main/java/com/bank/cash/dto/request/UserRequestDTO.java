package com.bank.cash.dto.request;

import com.bank.cash.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserRequestDTO {

    private String userFullName;

    private String password;

    private String mobile;

    private String email;

   
}