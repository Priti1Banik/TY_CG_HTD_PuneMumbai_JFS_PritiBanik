package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Priya");
	al.add(2);
	al.add('F');
	al.add(5.6);
	
	Iterator it = al.iterator();
	System.out.println("forward");
	while(it.hasNext()) {
    Object r =	it.next();
		System.out.println(r);
	}
	

}
}
