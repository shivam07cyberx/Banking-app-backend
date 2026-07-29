package com.bank.cash.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepositRequestDTO {

    private Long accountNumber;

    private Double amount;
}
