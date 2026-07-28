package com.bank.cash.dto.response;

import java.math.BigDecimal;

import com.bank.cash.enums.TypeName;

public class AccountTypeResponseDTO {

    private Long typeId;

    private TypeName typeName;

    private BigDecimal interestRate;

    private BigDecimal minimumBalance;

    private BigDecimal annualMaintenanceCharge;
}