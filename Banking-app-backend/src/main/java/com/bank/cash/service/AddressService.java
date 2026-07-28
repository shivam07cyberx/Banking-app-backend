package com.bank.cash.service;

import com.bank.cash.dto.request.AddressRequestDTO;
import com.bank.cash.dto.response.AddressResponseDTO;

public interface AddressService {

	public AddressResponseDTO addAddress( Long id,AddressRequestDTO addressRequest);
}
