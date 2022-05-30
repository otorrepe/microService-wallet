package com.nttdata.bank.wallet.service;

import com.nttdata.bank.wallet.model.Wallet;

import reactor.core.publisher.Mono;

public interface WalletService {
	
	Mono<Wallet> save(Wallet wallet);
	
}
