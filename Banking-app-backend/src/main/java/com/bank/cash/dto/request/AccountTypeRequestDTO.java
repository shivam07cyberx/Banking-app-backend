package com.bank.cash.dto.request;

import java.math.BigDecimal;

import com.bank.cash.enums.TypeName;

public class AccountTypeRequestDTO {

    private TypeName typeName;

    private BigDecimal interestRate;

    private BigDecimal minimumBalance;

    private BigDecimal annualMaintenanceCharge;
}