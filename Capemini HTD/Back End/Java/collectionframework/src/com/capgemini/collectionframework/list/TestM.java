package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM{
public static void main(String[] args) {
	LinkedList<Character> li = new LinkedList();

	li.add('S');
	li.add('A');
	li.add('P');
	li.add('C');
	
	System.out.println("for loop");
	for(int i=0;i<4;i++) {
			Character r = li.get(i);
			System.out.println(r);
	}
	System.out.println("for each");
	for(Character r: li) {
		System.out.println(r);
	}

Iterator<Character> it =li.iterator();
System.out.println("iterator");
while(it.hasNext()) {
	Character r = it.next();
	System.out.println(r);
}

ListIterator<Character> it1 =li.listIterator();
System.out.println("forward");
while(it1.hasNext()) {
	Character r = it1.next();
	System.out.println(r);
}


System.out.println("backward");
	while(it1.hasPrevious()) {
		Character r = it1.previous();
		System.out.println(r);


	}
}
}

