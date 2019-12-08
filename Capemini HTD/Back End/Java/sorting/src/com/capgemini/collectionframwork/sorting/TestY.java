package com.capgemini.collectionframwork.sorting;

import java.util.Iterator;
import java.util.TreeSet;
public class TestY {
public static void main(String[] args) {
	TreeSet<Employee1> ts = new TreeSet<Employee1>();
	

	Employee1 e1 = new Employee1(1,"Abc",27395.50);
	Employee1 e2 = new Employee1(2,"Pqr",17065.625);
	Employee1 e3 = new Employee1(3,"Ghj",23564.45);
	Employee1 e4 = new Employee1(4,"ijk",29065.64);
	 
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);

	Iterator<Employee1> it =ts.iterator();
	   while(it.hasNext()) {
		   Employee1 r = it.next();
		   System.out.println("name is: "+r.name);
		   System.out.println("id is: "+r.id);
		   System.out.println("sal is:"+r.salary);

}
}
}
