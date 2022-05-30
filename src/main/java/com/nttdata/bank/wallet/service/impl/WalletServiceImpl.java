package com.nttdata.bank.wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bank.wallet.model.Wallet;
import com.nttdata.bank.wallet.service.WalletService;

import reactor.core.publisher.Mono;

@Service
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletEventsService walletEventsService;
	

	@Override
	public Mono<Wallet> save(Wallet wallet) {
		System.out.println("wallet:  " + wallet);
		walletEventsService.publish(wallet);
		return Mono.just(wallet);
	}

}
