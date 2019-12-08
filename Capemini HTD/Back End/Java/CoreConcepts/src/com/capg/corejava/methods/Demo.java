package com.capg.corejava.methods;

public class Demo {
	
	static MethodExample me= new MethodExample();//default constructor
	
	public static void main(String[] args) {
		// or MethodExample me1= new MethodExample();
		MethodExample me1= new MethodExample();
		System.out.println(me);
		System.out.println(me1);
		System.out.println(MethodExample.areaOfSquare(6));
		System.out.println(me.areaOfRec(2,6));
		System.out.println(me1.areaOfRec(2,6));
//		int r=me.y;
//		System.out.println(r);
	}

}
