package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;

public class TestG {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(15);
	hs.add('A');
	hs.add(2.6);
	hs.add("Abcd");
	hs.add('A');
	hs.add(null);
	hs.add(null);
	
	
	System.out.println("for each loop");
	for(Object r: hs) {
		System.out.println(r);
	}
}
}
