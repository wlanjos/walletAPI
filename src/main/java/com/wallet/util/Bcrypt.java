package com.wallet.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bcrypt {

	public static String getHash(String password) {
		if (password == null) {
			return null;
		}
		
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
		return encode.encode(password);
	}
	
}
