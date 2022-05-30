package com.nttdata.bank.wallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
	
	private String _id;
	
	private String name;
	
	private String surnames;
	
	private int mobile;
	
	private int imeiMobile;
	
	private String email;
	
	private String document;

}
