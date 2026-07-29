package com.bank.cash.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.bank.cash.enums.AccountStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Size;
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
public class Account {

	
	
	@Id
	@Column(unique = true)

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long accountNumber;
	
	@NonNull
	private Double balance;
	
	
	@Column(length = 100 )
	@NonNull
	private String branchName;
	
	@Size(min = 6)
	@NonNull
	private String ifscCode;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL )
	
	@JoinColumn(name="account_type_id")
	private AccountType accountType;
	
	
	@Enumerated(EnumType.STRING)
	private AccountStatus accountStatus;
	
	@OneToMany(mappedBy = "fromAccount", fetch = FetchType.LAZY)
	private List<Transaction> debitTransactions;

	@OneToMany(mappedBy = "toAccount", fetch = FetchType.LAZY)
	private List<Transaction> creditTransactions;
	
	
//	..................meta data.......................
	
	
	@Version
	private Integer noOfUpdate;
	
	@CreationTimestamp
	@Column(insertable = true)
	private LocalDateTime accounntCreatedAt;
	
	@UpdateTimestamp
	@Column( updatable = true )
	private LocalDateTime accountUpdatedAt;
	
	
}
