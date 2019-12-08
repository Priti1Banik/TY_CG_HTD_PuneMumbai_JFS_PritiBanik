package com.capgemini.stream.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.capgemini.stream.Employee;

public class TestD {
public static void main(String[] args) {
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	p.add(10);
	p.add(6);
	p.add(4);
	p.add(9);
	
	Iterator it =p.iterator();
	while(it.hasNext()) {
		Integer r = (Integer) it.next();
		System.out.println(r);
}
}
}