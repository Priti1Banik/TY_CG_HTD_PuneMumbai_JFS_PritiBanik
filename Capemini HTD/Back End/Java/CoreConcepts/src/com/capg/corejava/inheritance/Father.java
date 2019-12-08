package com.capg.corejava.inheritance;

public class Father extends Grandfather {
String fname="Eddard";

public static void main(String[] args) {
	new Father().printName();// object created for father class but in this class we dont have to create obj. of anyconstructor present in grandfather 
}
@Override
public void printName() {
	System.out.println(fname+" "+name+" "+lastname);
	super.printName();
}


}
