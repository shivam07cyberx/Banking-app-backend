package com.bank.cash.dto.request;

import java.math.BigDecimal;

import com.bank.cash.enums.TypeName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountRequestDTO {

    private Long userId;

   private Double balance;
   
   private TypeName accountType;
   
   
   
   
   
}