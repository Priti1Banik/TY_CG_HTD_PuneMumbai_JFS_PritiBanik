package com.capgemini.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestB {
	public static void main(String[] args) {

		Comparator<Employee> comp = (c1,c2) -> {
			if(c1.height>c2.height) {
				return 1;
			}
			else if(c1.height<c2.height) {
				return -1;
			}
			else {
			return 0;	
			}
			};

			
		TreeSet<Employee> ts = new TreeSet<Employee>(comp);

		Employee e1 = new Employee(1,"Abc",5.6);
		Employee e2 = new Employee(2,"Pqr",6.1);
		Employee e3 = new Employee(3,"Ghj",5.2);
		Employee e4 = new Employee(4,"ijk",5.24);
		Employee e5 = new Employee(5,"Pqr",5.9);


		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);



		Iterator<Employee> it =ts.iterator();
		while(it.hasNext()) {
			Employee r = it.next();
			System.out.println("name is: "+r.name);
			System.out.println("ID is: "+r.id);
			System.out.println("height is: "+r.height);
			System.out.println("***************************");
		}

		}
		}


