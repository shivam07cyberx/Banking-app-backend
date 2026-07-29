package com.bank.cash.dto.response;


import com.bank.cash.enums.AccountStatus;
import com.bank.cash.enums.TypeName;

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
    
    private AccountStatus accountStatus;
}