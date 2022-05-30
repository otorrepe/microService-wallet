package com.nttdata.bank.wallet.events;

import com.nttdata.bank.wallet.model.Wallet;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class WlletCreatedEvent extends Event<Wallet>{

}
