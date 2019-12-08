package com.capgemini.collectionframework.list2;

import java.util.ArrayList;

public class DoubleArray {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);

		System.out.println("Before......."+al);

		al.add(5.4);  //this method add the index to last index
		System.out.println("Result....."+al);

		al.add(1,7.6);  //this method add object to index 1 and push rest object to next index
		System.out.println("Result......"+al);

		double res = al.set(2,11.75); //this method change the object of index 2
		System.out.println("remove object: "+res);
		System.out.println("Result....."+al);
		
		
		
	}
}
