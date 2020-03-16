package com.wallet.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletItemDTO {

	
	private Long id;
	@NotNull(message = "Insira o id da carteira")
	private Long wallet;
	@NotNull(message = "insira uma data")
	private Date date;
	@NotNull(message = "Informe um tipo")
	private String type;
	@NotNull(message = "Informe uma descição")
	@Length(min = 5, message = "A descrição deve ter no minimo 5 caractes")
	private String description;
	@NotNull(message = "informe um valor")
	private BigDecimal value;
}
