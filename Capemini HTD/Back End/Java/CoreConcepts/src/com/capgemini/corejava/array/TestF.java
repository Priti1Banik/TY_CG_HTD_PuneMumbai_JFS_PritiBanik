package com.capgemini.corejava.array;

public class TestF {
	public static void main(String[] args) {
		double[] m= {1,2,3,4,5,6};
		recieve(m);
	}

	static void recieve(double[] a) { //static is used to call the method directly
		for(double i:a ) {
			System.out.println(i);
		}
	}
}
