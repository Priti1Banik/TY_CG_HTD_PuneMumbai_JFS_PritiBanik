package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestA {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(24);
	al.add("Abcd");
	al.add(2.9);
	al.add('F');
	
	//Object p = al.get(0);
	//Object q = al.get(1);
	//Object r = al.get(1);
	//Object s = al.get(1);
	
	//System.out.println(p);
	//System.out.println(q);
	//System.out.println(r);
	//System.out.println(s);
	
	//for(int i=0;i<4;i++) {
	//	Object r = al.get(i);
	//	System.out.println(r);
	
	for(Object r: al) {
		System.out.println(r);
	}
	}
	
}

