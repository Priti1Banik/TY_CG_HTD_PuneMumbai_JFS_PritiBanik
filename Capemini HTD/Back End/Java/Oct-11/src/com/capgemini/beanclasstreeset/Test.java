package com.capgemini.beanclasstreeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class Test {
public static void main(String[] args) {
	//ById b = new ById();
	ByName b = new ByName();
	TreeSet<Student> ts = new TreeSet<Student>(b);
	
	Student s1 = new Student();
	s1.setId(1);
	s1.setName("Ahbh");
	s1.setPercentage(56.78);
	s1.setGender('M');

	Student s2 = new Student();
	s2.setId(4);
	s2.setName("Hkhkh");
	s2.setPercentage(76.98);
	s2.setGender('F');

	Student s3 = new Student();
	s1.setId(3);
	s1.setName("Avhj");
	s1.setPercentage(89.56);
	s1.setGender('M');

	Student s4 = new Student();
	s4.setId(2);
	s4.setName("Ghujn");
	s4.setPercentage(76.00);
	s4.setGender('F');

	Student s5 = new Student();
	s5.setId(5);
	s5.setName("Sghbj");
	s5.setPercentage(45.78);
	s5.setGender('F');

	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);

	Iterator<Student> it =ts.iterator();
	while(it.hasNext()) {
		Student r = it.next();
		System.out.println("ID is: "+r.getId());
		System.out.println("Name is: "+r.getName());
		System.out.println("Percentage is: "+r.getPercentage());
		System.out.println("Gender is: "+r.getGender());
	
	}
}
}