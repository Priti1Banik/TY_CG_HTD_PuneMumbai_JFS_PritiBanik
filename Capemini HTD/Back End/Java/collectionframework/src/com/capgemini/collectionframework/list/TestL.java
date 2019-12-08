package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
public static void main(String[] args) {
	LinkedList<String> li = new LinkedList();

	li.add("Shital");
	li.add("Anish");
	li.add("Sam");
	li.add("Shruti");
	
	System.out.println("for loop");
	for(int i=0;i<4;i++) {
			String r = li.get(i);
			System.out.println(r);
	}
	System.out.println("for each");
	for(String r: li) {
		System.out.println(r);
	}

Iterator<String> it =li.iterator();
System.out.println("iterator");
while(it.hasNext()) {
	String r = it.next();
	System.out.println(r);
}

ListIterator<String> it1 =li.listIterator();
System.out.println("forward");
while(it1.hasNext()) {
	String r = it1.next();
	System.out.println(r);
}


System.out.println("backward");
	while(it1.hasPrevious()) {
		String r = it1.previous();
		System.out.println(r);


	}
}
}

