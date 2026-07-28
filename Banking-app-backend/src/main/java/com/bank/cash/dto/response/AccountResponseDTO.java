package com.bank.cash.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AccountResponseDTO {

    private Long accountNumber;

    private BigDecimal balance;

    private String branchName;

    private String ifscCode;

    private String accountType;

    private String accountHolderName;
}