package com.bank.cash.dto.response;

import java.math.BigDecimal;

import com.bank.cash.enums.TypeName;

import jakarta.validation.constraints.NegativeOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountTypeResponseDTO {



    private TypeName typeName;

    private Double interestRate;

    private Double minimumBalance;

    private Double annualMaintananceCharge;
}