package com.capgemini.corejava.exceptionhandling;

public class Fourth {
public static void main(String[] args) {
	System.out.println("main started");
	String s=null;
	int[] a=new int[3];
	try {
		System.out.println(s.toUpperCase());//using null so it will give null pointer exception
		System.out.println(a[1]);
		System.out.println(10/0); // arithmetic exception so another catch block is uses 
	}
catch(ArrayIndexOutOfBoundsException e) { //instead of these all catch block we can use general catch
	System.out.println("dont cross array boundary");
}
	catch(ArithmeticException i) {
		System.out.println("dont devide by zero");
	}
	catch(NullPointerException j) {
		System.out.println("dont use null");
	}
	catch(Exception e) { //always general catch block in the last
		System.out.println("something went wrong");
	}
System.out.println("main ended");
}
}
