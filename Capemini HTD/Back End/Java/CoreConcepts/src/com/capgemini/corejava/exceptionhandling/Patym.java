package com.capgemini.corejava.exceptionhandling;

public class Patym {
void book() {
	System.out.println("book Started");
	IRCTC i=new IRCTC();
	try {
	i.confirm();
	}
	catch(ArithmeticException e) {
		System.out.println("exception found at book");
	}
	System.out.println("book ended");
}
}
