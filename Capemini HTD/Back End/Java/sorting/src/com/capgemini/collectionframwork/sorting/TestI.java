package com.capgemini.collectionframwork.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestI {
	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<Employee>();

		Employee e1 = new Employee(1,"Abc",27395.50);
		Employee e2 = new Employee(2,"Pqr",17065.625);
		Employee e3 = new Employee(3,"Ghj",23564.45);
		Employee e4 = new Employee(4,"ijk",29065.64);
		Employee e5 = new Employee(2,"Pqr",17065.625);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);


		Iterator<Employee> it =hs.iterator();
		while(it.hasNext()) {
			Employee r = it.next();
			System.out.println("name is: "+r.name);
			System.out.println("ID is: "+r.id);
			System.out.println("Salary is: "+r.salary);
			System.out.println("***************************");
		}
	}
}

