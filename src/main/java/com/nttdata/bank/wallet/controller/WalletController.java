package com.nttdata.bank.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bank.wallet.model.Wallet;
import com.nttdata.bank.wallet.service.WalletService;

import reactor.core.publisher.Mono;

@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@PostMapping
	public Mono<Wallet> save(@RequestBody Wallet wallet) {
		return walletService.save(wallet);
	}
}
