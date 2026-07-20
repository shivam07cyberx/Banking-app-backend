package com.bank.cash.dto;

import com.bank.cash.enums.Role;
import com.bank.cash.enums.TypeName;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



	@Getter
	@Setter
	@Data
	@AllArgsConstructor
	@RequiredArgsConstructor
	@NoArgsConstructor
	public class UserDTO {

	    private Long id;

	    @NotBlank
	    @NonNull
	    private String userFullName;

	    @NotBlank
	    @NonNull
	    @Size(min = 8, max = 30)
	    private String password;
	    @NonNull
	    private Role role;
	    @NonNull
	    @NotBlank
	    @Pattern(regexp = "\\d{10}")
	    private String mobile;
	    @NonNull
	    @NotBlank
	    @Email
	    private String email;
	    @NonNull
	    private TypeName accountType;
	
	
}
