package com.capg.corejava.has_a_relationship;

public class Person extends Marker{
	int i=100;
	Marker m=new Marker();
	void walk() {
		System.out.println("walk");
	}

}
