package com.capg.corejava.loops;

public class DoWhileExample {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("i=" +i);
			i++;   //this again to stop infinite loop
		} while(i<=10); //while(true)--if used this the next step will be unreachable
			System.out.println("code outside the loop");
	}

}
