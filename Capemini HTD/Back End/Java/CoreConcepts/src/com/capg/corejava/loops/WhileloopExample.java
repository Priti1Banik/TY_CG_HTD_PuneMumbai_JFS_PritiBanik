package com.capg.corejava.loops;

public class WhileloopExample {
	public static void main(String[] args) {
		int i=5;
		while (i<=10) {
			System.out.println(i);
			i++;  // this will stop the infinite loop
		}
		System.out.println("code outside loop");
	
		/*while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("code outside loop");
	*/ 

}
}
