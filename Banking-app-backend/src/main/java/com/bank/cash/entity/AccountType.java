package com.bank.cash.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.bank.cash.enums.TypeName;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long typeId;
	
	@Enumerated(EnumType.STRING)
	private TypeName typeName;
	
	private Double interestRate;
	
	
	private Double minimumBalance;
	
	
	private Double annualMaintananceCharge;
	
	@OneToMany(mappedBy = "accountType" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Account> accounts;
	
	
//...........meta data..................
	
	
	  @Version
	    private Integer noOfUpdate;

	    @CreationTimestamp
	    private LocalDateTime createdAt;

	    @UpdateTimestamp
	    private LocalDateTime updatedAt;

}
