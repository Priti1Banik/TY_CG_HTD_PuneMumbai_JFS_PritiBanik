package com.capgemini.corejava.exceptionhandling;

public class First {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException a) {
			System.out.println("dont divide by zero");
			}
		System.out.println("main ended");
	}

}
