package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestR {
public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("Priti");
	hs.add("Sneha");
	hs.add("Anjali");
	hs.add("Ankita");
	
	System.out.println("for each loop");
	for(String r: hs) {
		System.out.println(r);
	}

	System.out.println("Iterator method");
   Iterator<String> it =hs.iterator();
   while(it.hasNext()) {
	   String r = it.next();
	   System.out.println(r);
   }


}
}
