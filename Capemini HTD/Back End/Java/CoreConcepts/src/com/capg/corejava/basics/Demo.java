package com.capg.corejava.basics;

interface Square {
	int sq(int a);
		
}
public class Demo {
	public static void main(String[] args) {
		Square s = a-> a*a;
		int i = s.sq(40);
		System.out.println("square is "+i);
	}

}
