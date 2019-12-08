package com.capgemini.corejava.array;

public class TestG {
	public static void main(String[] args) {
		String[] m= {"how","are","you","now"};
		recieve(m);
	}

	static void recieve(String[] a) { //static is used to call the method directly
		for(String i:a ) {
			System.out.println(i);
		}
	}

}
