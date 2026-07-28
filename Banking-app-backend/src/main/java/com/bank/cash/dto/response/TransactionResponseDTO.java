package com.bank.cash.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bank.cash.enums.TransactionType;

public class TransactionResponseDTO {

    private Long transactionId;

    private TransactionType transactionType;

    private BigDecimal amount;

    private Long fromAccount;

    private Long toAccount;

    private String remarks;

    private LocalDateTime transactionTime;
}