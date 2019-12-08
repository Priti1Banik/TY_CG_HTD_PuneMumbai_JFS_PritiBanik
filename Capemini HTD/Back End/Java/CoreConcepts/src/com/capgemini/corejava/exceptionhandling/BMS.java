package com.capgemini.corejava.exceptionhandling;

public class BMS {
public static void main(String[] args) {
	System.out.println("main started");
	PVR p=new PVR();
	try {
		p.confirm();
	}
	catch(ArithmeticException i) {
		System.out.println("exception caught at main of bms");
	} 
System.out.println("main ended");
}
}
