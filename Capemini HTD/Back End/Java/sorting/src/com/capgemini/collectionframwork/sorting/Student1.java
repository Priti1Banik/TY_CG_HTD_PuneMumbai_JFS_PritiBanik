package com.capgemini.collectionframwork.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1 {
public static void main(String[] args) {
		

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1,"Priti",73.95);
		Student s2 = new Student(4,"Ankita",70.65);
		Student s3 = new Student(2,"Sonam",76.45);
		Student s4 = new Student(3,"Pia",65.65);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			
			System.out.println("name is: "+s.name);
			System.out.println("Id is: "+s.id);
			System.out.println("percentage: "+s.percentage);
			System.out.println(".........................");
		}
		
		
		
		
}
}
