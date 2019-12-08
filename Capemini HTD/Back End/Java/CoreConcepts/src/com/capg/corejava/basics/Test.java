package com.capg.corejava.basics;

interface Sum {
int add(int a,int b);
}

public class Test {
	public static void main(String[] args) {
		Sum f = (a,b) -> a+b;
		int j = f.add(20, 40);
		System.out.println("sum is "+j);
	}
}