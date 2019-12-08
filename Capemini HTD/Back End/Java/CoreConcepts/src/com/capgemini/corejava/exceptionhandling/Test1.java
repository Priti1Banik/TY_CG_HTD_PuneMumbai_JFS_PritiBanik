package com.capgemini.corejava.exceptionhandling;

public class Test1 {
public static void main(String[] args) {
	System.out.println("main started");
	String k=null;
	int[] a=new int[3];
	try {
		System.out.println(k.length());
		System.out.println(a[5]);
		System.out.println(10/0);
	}
	catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {
		e.printStackTrace();// this will give the inbuilt message
	}
System.out.println("main ended");
}

}
