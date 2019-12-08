package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	al.add(24);
	al.add("Abcd");
	al.add(2.9);
	al.add('F');

	Iterator it = al.iterator();
	Object r = it.next();
	Object p = it.next();
	Object s = it.next();
	Object t = it.next();
	
	//Object c = it.next();    
	//System.out.println(c);  this will give exception as last object cannot print because index not present
	
	System.out.println(r);
	System.out.println(p);
	System.out.println(s);
	System.out.println(t);
	}
}
