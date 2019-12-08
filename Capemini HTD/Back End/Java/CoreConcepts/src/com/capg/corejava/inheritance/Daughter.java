package com.capg.corejava.inheritance;

public class Daughter extends Father implements InterfaceExample{
	String dname= "Sansa";
	public static void main(String[] args) {
		new Daughter().printName();//object created as well as invoking 
		new Daughter().display();
		new Daughter().show();
		
	}
	@Override
public void printName() {//return type should be same as super class
	System.out.println(dname+" "+fname+" "+lastname);
	super.printName();//super keyword check for the immediate super class corresponding to this class
	
}
	@Override
	public void display() {
		System.out.println("display method of daughter");
		
	}
	@Override
	public void show() {
		System.out.println("show method of daughter");
		
	}
}
