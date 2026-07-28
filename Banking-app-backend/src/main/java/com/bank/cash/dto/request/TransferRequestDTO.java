package com.bank.cash.dto.request;

import java.math.BigDecimal;

public class TransferRequestDTO {

    private Long fromAccount;

    private Long toAccount;

    private BigDecimal amount;

    private String remarks;
}
