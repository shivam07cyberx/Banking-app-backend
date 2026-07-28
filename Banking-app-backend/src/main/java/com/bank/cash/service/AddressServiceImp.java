package com.bank.cash.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.cash.dto.request.AddressRequestDTO;
import com.bank.cash.dto.response.AddressResponseDTO;
import com.bank.cash.entity.Address;
import com.bank.cash.entity.User;
import com.bank.cash.repository.IAddressRepository;
import com.bank.cash.repository.IUserRepository;

@Service
public class AddressServiceImp implements AddressService{
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private IAddressRepository addressRepository;
	@Override
	public AddressResponseDTO addAddress( Long id,AddressRequestDTO addressRequest) {
		
		
		Address address=modelMapper.map(addressRequest,Address.class);
		
		Address savedAddress=null;
		
		User user=userServ.findUserEntityById(id);
		
		if(user.getAddress()==null) {
		
		user.setAddress(address);
		
		address.setUser(user);
		
	 savedAddress=	addressRepository.save(address);
		userRepo.save(user);
		
		}
		
		else {
			
			//update//
			System.out.println("address arlerady there");
		}
		AddressResponseDTO response  = modelMapper.map(savedAddress, AddressResponseDTO.class) ;
		
		
		return response;
		
	}

}
