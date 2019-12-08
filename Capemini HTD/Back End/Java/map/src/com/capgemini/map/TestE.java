package com.capgemini.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestE {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Priti",73.95);
		Student s2 = new Student(2,"Ankita",70.65);
		Student s3 = new Student(3,"Sonam",76.45);
		Student s4 = new Student(4,"Pia",65.65);
		Student s5 = new Student(5,"Priyanka",73.95);
		Student s6 = new Student(6,"Ananya",70.65);
		Student s7 = new Student(7,"Sonali",76.45);
		Student s8 = new Student(8,"Piyali",65.65);
		Student s9 = new Student(9,"Priya",65.65);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);


		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(s6);
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);

		LinkedHashMap<String,ArrayList<Student>> hm = new LinkedHashMap<String,ArrayList<Student>>();
		hm.put("First",al1);
		hm.put("Second", al2);
		hm.put("Third", al3);

		ArrayList<Student> al = hm.get("First");
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("*********************");
		}
	}
}