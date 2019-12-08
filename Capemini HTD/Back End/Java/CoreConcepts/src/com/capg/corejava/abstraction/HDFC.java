package com.capg.corejava.abstraction;

public class HDFC implements ATM{

	@Override
	public void validateCard() {
		System.out.println("....connecting to HDFC DB");
		System.out.println("HDFC card is getting validated");
		
	}

	@Override
	public void getInfo() {
		System.out.println("....connecting to HDFC DB");
		System.out.println("HDFC is getting info");
		
	}

}
