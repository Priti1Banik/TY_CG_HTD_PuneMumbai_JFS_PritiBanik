package com.capg.corejava.methods;

public class MethodExample {
	static int y;
	public static void main(String[] args) {
		print();
		int i= areaOfSquare(5);// we need to store the return value into some variable otherwise we will not get proper o/p
		System.out.println("area of square=" +i);
		//MethodExample me= new MethodExample();---->we dont have create object everytime if this way is used
		//int area= new MethodExample().areaOfRec(2,5);
		System.out.println(new MethodExample().areaOfRec(2,5));  //save lines of code but we have to create object everytime
	}
	public static void print() {
		System.out.println("print() method");
	}
public static int areaOfSquare(int side) {
	return side*side; // or we can do int area=side*side and return area
	
}
public int areaOfRec(int length,int breadth) { //belongs to object of a class since non static
	return length*breadth;	
}
}
