package com.capgemini.corejava.exceptionhandling;

public class Test {
public static void main(String[] args) {
	System.out.println("main started");
	Patym p=new Patym();
	
	try {
	p.book();
	}
	catch(ArithmeticException e) { //this will not handle any exception if patym is handling
		System.out.println("exception caught at main");
	}
	System.out.println("main ended");
	
}
}
