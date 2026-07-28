package com.bank.cash.dto.request;

import java.math.BigDecimal;

public class AccountRequestDTO {

    private Long userId;

    private Long accountTypeId;

    private String branchName;

    private String ifscCode;

    private BigDecimal openingBalance;
}