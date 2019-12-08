package com.capg.corejava.abstraction;

public class SBI implements ATM{

	@Override
	public void validateCard() {
		System.out.println("....connecting to SBI DB");
		System.out.println("SBI card is getting validated");
		
	}

	@Override
	public void getInfo() {
		System.out.println("....connecting to SBI DB");
		System.out.println("SBI card is getting info");
		
	}

}
