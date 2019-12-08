package com.capgemini.corejava.exceptionhandling;

public class Test3 {
public static void main(String[] args) {
	Amount a=new Amount();
	try {
		a.check(50000);
		System.out.println("sorry");
	}
	catch(InvalidLimitException i) {
		System.out.println(i.getMessage());
	}
}
}
