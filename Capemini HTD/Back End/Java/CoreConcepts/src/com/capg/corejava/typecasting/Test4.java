package com.capg.corejava.typecasting;

public class Test4 {
public static void main(String[] args) {
	Pen p=new Marker();  //up-casting
	
	Marker i=(Marker)p;  //down-casting
	i.cost=100;
	i.write();
	i.size=3;
	i.color();
	
}
}
