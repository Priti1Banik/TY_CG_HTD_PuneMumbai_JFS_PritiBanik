package com.capg.corejava.inheritance;

public class Grandfather {
	String name = "Torrhen";
	String lastname= "Stark";
	public static void main(String[] args) {
		Grandfather g= new Grandfather();
		g.printName();
		
	}
	public void printName() {
	System.out.println(name+" "+lastname);	
	}

}
