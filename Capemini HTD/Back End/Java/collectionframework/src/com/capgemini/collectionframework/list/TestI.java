package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestI {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();

	al.add(9.78);
	al.add(77.67);
	al.add(12.98);
	al.add(44.57);

for(double d: al) {
	System.out.println(d);
}
}
}
