package com.wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.entity.UserWallet;
import com.wallet.entity.Wallet;
import com.wallet.repository.UserWalletRepository;
import com.wallet.service.UserWalletService;

@Service
public class UserWalletImpl implements UserWalletService{

	@Autowired
	UserWalletRepository repository;
	
	@Override
	public UserWallet save(UserWallet uw) {
		
		return repository.save(uw);
	}

	
}
