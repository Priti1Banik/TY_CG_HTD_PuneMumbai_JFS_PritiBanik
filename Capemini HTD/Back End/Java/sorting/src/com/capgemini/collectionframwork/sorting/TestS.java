package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestS {
public static void main(String[] args) {
	
	LinkedHashSet hs = new LinkedHashSet();
	hs.add(15);
	hs.add('A');
	hs.add(2.6);
	hs.add("Abcd");
	hs.add(null);
	hs.add(null);
	
	System.out.println("*************for each loop******************");
	for(Object r: hs) {
		System.out.println(r);
	}

	System.out.println("*************Iterator method******************");
   Iterator it =hs.iterator();
   while(it.hasNext()) {
	   Object r = it.next();
	   System.out.println(r);
   }



	
	
	
	
}
}
