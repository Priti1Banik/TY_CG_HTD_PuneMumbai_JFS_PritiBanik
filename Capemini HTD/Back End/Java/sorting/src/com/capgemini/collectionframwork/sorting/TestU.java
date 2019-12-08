package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.TreeSet;

public class TestU {
public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(15);
		ts.add(10);
		ts.add(24);
		ts.add(25);
		ts.add(null);
		
		System.out.println("for each loop");
		for(Object r: ts) {
			System.out.println(r);
		}
}
}