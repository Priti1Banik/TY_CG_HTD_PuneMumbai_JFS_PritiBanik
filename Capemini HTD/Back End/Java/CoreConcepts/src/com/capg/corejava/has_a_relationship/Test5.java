package com.capg.corejava.has_a_relationship;

public class Test5 {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.i);
		//p.i=100;
		p.walk();
		p.m.write();
		p.m.color();
	}

}
