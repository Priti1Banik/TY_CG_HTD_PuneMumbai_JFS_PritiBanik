package com.capgemini.corejava.exceptionhandling;

public class Third {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			System.out.println("hi");
			System.out.println("hello");
			System.out.println(10/0);
			System.out.println("bye");// this line will not execute once exception is thrown
		}
		catch(ArithmeticException e) {
			System.out.println("bbye");
		}
	System.out.println("main ended");
	}
	

}
