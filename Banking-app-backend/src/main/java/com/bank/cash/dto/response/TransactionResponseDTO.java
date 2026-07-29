package com.bank.cash.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bank.cash.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionResponseDTO {

  

    private TransactionType transactionType;

    private Double amount;

    private Long fromAccount;

    private Long toAccount;

    private LocalDateTime transactionTime;
}