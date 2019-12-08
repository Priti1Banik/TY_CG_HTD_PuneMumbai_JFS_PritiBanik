package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {
public static void main(String[] args) {
	LinkedList li = new LinkedList();

	li.add(9.78);
	li.add("Anish");
	li.add('s');
	li.add(44);
	
	System.out.println("for loop");
	for(int i=0;i<4;i++) {
			Object r = li.get(i);
			System.out.println(r);
	}
	System.out.println("for each");
	for(Object r: li) {
		System.out.println(r);
	}

Iterator it =li.iterator();
System.out.println("iterator");
while(it.hasNext()) {
	Object r = it.next();
	System.out.println(r);
}

ListIterator it1 =li.listIterator();
System.out.println("forward");
while(it1.hasNext()) {
	Object r = it1.next();
	System.out.println(r);
}


System.out.println("backward");
	while(it1.hasPrevious()) {
		Object r = it1.previous();
		System.out.println(r);


	}
}
}

