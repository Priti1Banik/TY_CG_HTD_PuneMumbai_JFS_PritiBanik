package com.capg.corejava.typecasting;

public class PremitiveCasting {
	public static void main(String[] args) {
		byte m=16;
		int i=m;  //widening or implicit type casting
		double d=96.75;
		int p=(int)d; //narrowing or explicit type casting using cast operator
		System.out.println(i);
		System.out.println(p);
	}

}
