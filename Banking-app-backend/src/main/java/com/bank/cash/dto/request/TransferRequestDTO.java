package com.bank.cash.dto.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class TransferRequestDTO {

    private Long fromAccount;

    private Long toAccount;

    private Double amount;


}
