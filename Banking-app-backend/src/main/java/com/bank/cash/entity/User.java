package com.bank.cash.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.bank.cash.enums.Role;
import com.bank.cash.enums.TypeName;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank
	@Column(nullable = false)
	private String userFullName;
	
	@Size(min = 8, max = 30)
	@NotBlank
	@Column(nullable = false, length = 30)
	private String password;
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	@NotBlank
	@Pattern(regexp = "\\d{10}")

	@Column(nullable = false , length = 10)
	private String mobile;
	

	

	
	
	
	@Email
	@NotBlank

	@Column(unique = true, nullable = false, length = 100)
private String email;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Account> accounts;
	
	
//	..................meta data.......................
	
	
	@Version
	private Integer noOfUpdate;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
}
