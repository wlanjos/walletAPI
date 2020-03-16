package com.wallet.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {

	
	private T data;
	private List<String> erros;
	
	public List<String> getErros(){
		if (this.erros == null) {
			this.erros = new ArrayList<String>();
		}
		return erros;
	}
	
	
	
}
