package com.bank.cash.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressRequestDTO {

    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;

}