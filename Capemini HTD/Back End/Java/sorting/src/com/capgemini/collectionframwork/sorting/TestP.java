package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestP {
public static void main(String[] args) {
	
	HashSet hs = new HashSet();
	hs.add(15);
	hs.add('A');
	hs.add(2.6);
	hs.add("Abcd");
	
	System.out.println("for each loop");
	for(Object r: hs) {
		System.out.println(r);
	}

	System.out.println("Iterator method");
   Iterator it =hs.iterator();
   while(it.hasNext()) {
	   Object r = it.next();
	   System.out.println(r);
   }



}
}
