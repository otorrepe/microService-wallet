package com.nttdata.bank.wallet.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nttdata.bank.wallet.events.Event;
import com.nttdata.bank.wallet.events.WlletCreatedEvent;
import com.nttdata.bank.wallet.model.Wallet;

@Component
public class WalletEventsService {
	
	@Autowired
	private KafkaTemplate<String, Event<?>> producer;
	
	@Value("${topic.wallet.name:wallets}")
	private String topicWallet;
	
	public void publish(Wallet wallet) {

		WlletCreatedEvent created = new WlletCreatedEvent();
		created.setData(wallet);
		created.setId(UUID.randomUUID().toString());
//		created.setType(EventType.CREATED);
		created.setDate(new Date());

		this.producer.send(topicWallet, created);
	}

}
