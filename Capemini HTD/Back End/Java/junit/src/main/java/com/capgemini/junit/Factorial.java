package com.capgemini.junit;

public class Factorial {

	public int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact= fact*i;
		}
		return fact;
	}
}
