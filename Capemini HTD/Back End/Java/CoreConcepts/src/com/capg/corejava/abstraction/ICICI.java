package com.capg.corejava.abstraction;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("....connecting to ICICI DB");
		System.out.println("ICICI card is getting validated");
		
	}

	@Override
	public void getInfo() {
		System.out.println("....connecting to ICICI DB");
		System.out.println("ICICI card is getting info");
		
	}

}
