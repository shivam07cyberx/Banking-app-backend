package com.bank.cash.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long addressId;

	    private String houseNo;
	    private String street;
	    private String city;
	    private String state;
	    private String country;
	    private String pinCode;
	    
	    
	    @OneToOne(mappedBy = "address")
	    private User user;
	    
	    // metadata
	    
	    @CreationTimestamp
	    private LocalDateTime createdAt;
	    
	    @Version
	    private Integer updateCount;
	    
	    @UpdateTimestamp
	    private LocalDateTime updatedOn;
	    
}
