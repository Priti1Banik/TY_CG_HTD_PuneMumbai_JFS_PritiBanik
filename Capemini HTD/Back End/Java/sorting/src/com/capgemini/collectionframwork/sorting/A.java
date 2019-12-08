package com.capgemini.collectionframwork.sorting;

import java.util.Iterator;
import java.util.TreeSet;

public class A {
public static void main(String[] args) {
	ById p = new ById();
	//ByName r = new Byname();
	TreeSet<Bank> ts = new TreeSet<Bank>(p);
	
	Bank b1 = new Bank(4675784,"UBI",628782797l);
	Bank b2 = new Bank(7738279,"SBI",723873919l);
	Bank b3 = new Bank(8980189,"UCO",917198198l);
	Bank b4 = new Bank(9721972,"IDBI",971018910l);
	 
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b = it.next();
		System.out.println("pin is: "+b.pin);
		System.out.println("name is: "+b.name);
		System.out.println("Micr no is: "+b.micr);
		
	}
}
}
