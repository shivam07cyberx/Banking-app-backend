package com.bank.cash.entity;

import java.time.LocalDateTime;

import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.bank.cash.enums.Role;
import com.bank.cash.enums.TransactionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	
	
	@NonNull
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	
	@NonNull
	private Double amount;
	
	@ManyToOne
	
	@JoinColumn(name="from_account")
	private Account fromAccount;

	
	@ManyToOne
	@JoinColumn(name="to_account")
	private Account toAccount;
	
	// meta data
	
@Version
private Integer noOfUpdate;

@CreationTimestamp
private LocalDateTime transactionTime;

}
