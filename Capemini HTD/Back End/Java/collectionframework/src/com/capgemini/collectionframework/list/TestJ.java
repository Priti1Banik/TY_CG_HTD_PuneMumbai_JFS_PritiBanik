package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();

	al.add(9.78);
	al.add(77.67);
	al.add(12.98);
	al.add(44.57);

ListIterator<Double> it =al.listIterator();
while(it.hasNext()) {
	Double r = it.next();
	System.out.println(r);
}
System.out.println("backward");
	while(it.hasPrevious()) {
		Double r = it.previous();
		System.out.println(r);


	}
}
}

