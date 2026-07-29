package com.bank.cash.dto.request;

import java.math.BigDecimal;

import com.bank.cash.enums.TypeName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountTypeRequestDTO {

    private TypeName typeName;

    private Double interestRate;

    private Double minimumBalance;

    private Double annualMaintananceCharge;
    
    
    
    
}