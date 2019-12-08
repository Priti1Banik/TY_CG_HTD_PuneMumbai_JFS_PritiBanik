package com.capgemini.corejava.classobject;

public class Demo {
	public static void main(String[] args) {
		Pen p=new Pen();
		int add1=p.hashCode();// given address of the object created
		System.out.println("Address is " +add1);
		System.out.println(p);//return FQPN along with hexadecimal address which is similar to toString()
		//Pen s= new Pen();
		int add2=p.hashCode();
		System.out.println("Address is " +add2);
		
		String r=p.toString();
		System.out.println(r);
	}

}
