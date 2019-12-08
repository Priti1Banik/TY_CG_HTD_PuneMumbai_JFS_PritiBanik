package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestQ {

	public static void main(String[] args) {
		
		HashSet<Double> hs = new HashSet();
		hs.add(77.80);
		hs.add(34.87);
		hs.add(23.65);
		hs.add(47.33);
		
		System.out.println("for each loop");
		for(double r: hs) {
			System.out.println(r);
		}

		System.out.println("Iterator method");
	   Iterator<Double> it =hs.iterator();
	   while(it.hasNext()) {
		   double r = it.next();
		   System.out.println(r);
	   }

	   }
}
