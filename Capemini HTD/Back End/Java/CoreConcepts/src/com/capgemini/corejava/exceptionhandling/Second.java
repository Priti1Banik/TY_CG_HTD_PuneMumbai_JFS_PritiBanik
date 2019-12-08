package com.capgemini.corejava.exceptionhandling;

public class Second {
public static void main(String[] args) {
	System.out.println("main method started");
	
	int[] a=new int[3];
	 
		try {
	System.out.println(a[7]);
	
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("dont cross array boundary");
	}
		System.out.println("main ended");
}
}
