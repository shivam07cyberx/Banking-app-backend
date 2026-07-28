package com.bank.cash.dto.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AddressResponseDTO {

    private Long addressId;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    private LocalDateTime createdAt;
    private LocalDateTime updatedOn;

}
