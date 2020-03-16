package com.wallet.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

	
	private Long id;
	@Email(message = "Email invalido")
	private String email;
	@Length(min = 3, max = 50,message ="O nome deve conter entre 3 e 50 caracteres" )
	private String name;
	@NotNull
	@Length(min = 6, message = "A Senha deve possuir no minimo 6 caracter")
	private String password;
}
