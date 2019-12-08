package com.capgemini.corejava.exceptionhandling;

public class PVR {
void confirm() {
	System.out.println("confirmed started");
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("exception handled at PVR");
		throw e;
	}
	finally {
    System.out.println("confirm ended");
}

}
}
