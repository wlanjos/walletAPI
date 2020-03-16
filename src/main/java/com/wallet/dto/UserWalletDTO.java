package com.wallet.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	
	private Long id;
	@NotNull(message = "Informe o Id do Usuario")
	private Long users;
	@NotNull(message = "informe o Id da carteira")
	private Long wallet;
	
	
	
}
