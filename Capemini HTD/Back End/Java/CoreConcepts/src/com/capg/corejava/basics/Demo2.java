package com.capg.corejava.basics;

interface Area {
	double circlearea(double r);
}

public class Demo2 {
public static void main(String[] args) {
	Area a = r->3.142*r*r;
	double res=a.circlearea(3.6);
	System.out.println(res);
}
}
