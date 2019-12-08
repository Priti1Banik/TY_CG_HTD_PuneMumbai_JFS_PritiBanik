package com.capg.corejava.inheritance;

public class Son extends Father implements InterfaceExample{
String sname= "Robb";
public static void main(String[] args) {
	new Son().printName();
	new Son().display();
	new Son().show();
}
@Override
public void printName() {
	System.out.println(sname+" "+fname+" "+lastname);
	super.printName();
}
@Override
public void display() {
	System.out.println("display method in son");
	
}
@Override
public void show() {
	System.out.println("show method in son");
	
}

}
