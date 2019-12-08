package com.capgemini.corejava.exceptionhandling;

public class Test2 {
public static void main(String[] args) {
	Validator v=new Validator();
	try {
		v.verify(15);
		System.out.println("sorry not ready to proceed");
	}
catch(InvalidAgeException i) {
	
	System.out.println(i.getMessage());
}
	
	
	

}
}
