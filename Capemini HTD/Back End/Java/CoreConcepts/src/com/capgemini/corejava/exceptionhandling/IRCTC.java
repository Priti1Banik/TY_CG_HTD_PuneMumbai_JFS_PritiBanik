package com.capgemini.corejava.exceptionhandling;

public class IRCTC {

	void confirm() {
		System.out.println("confirm started");
	try {
        System.out.println(10/0);
	}
	catch(ArithmeticException e) { // this will allow as to get all the output along with statement in catch block
		System.out.println("exception caught at confirm");
	}
		System.out.println("confirm ended");
	
	}
	
}
