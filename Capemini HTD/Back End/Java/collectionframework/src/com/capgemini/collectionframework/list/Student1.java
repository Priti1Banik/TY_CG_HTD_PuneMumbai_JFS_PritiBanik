package com.capgemini.collectionframework.list;


import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;

public class Student1 {
	//	int id;
	//	String name;
	//	double percentage;
	//
	//	public Student1(int id, String name, double percentage) {
	//		super();
	//		this.id = id;
	//		this.name = name;
	//		this.percentage = percentage;
	//	}

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1,"Priti",73.95);
		Student s2 = new Student(2,"Ankita",70.65);
		Student s3 = new Student(3,"Sonam",76.45);
		Student s4 = new Student(4,"Pia",65.65);
		Student s5 = new Student(5,"Ritika",89.75);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Helper h = new Helper();
		h.display(al);
		h.onlyPass(al);
		h.distinctPass(al);



	}
}