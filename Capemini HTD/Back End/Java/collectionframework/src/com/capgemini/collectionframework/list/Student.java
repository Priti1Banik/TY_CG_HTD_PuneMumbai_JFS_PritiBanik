package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

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


				System.out.println("....for loop....");

		for(int i=0;i<5;i++) {
			Student r=al.get(i);
			System.out.println("id is: "+r.id);
			System.out.println("name is: "+r.name);
			System.out.println("percentage is: "+r.percentage);
			System.out.println("............");
		}
			System.out.println("....for each loop....");
			for(Student s:al) {
				System.out.println("id is: "+s.id);
				System.out.println("name is: "+s.name);
				System.out.println("percentage is: "+s.percentage);
				System.out.println("............");
			}
				System.out.println("iterator");
				Iterator<Student> it = al.iterator();
				while(it.hasNext()) {
					Student r1 = it.next();

					System.out.println("id is: "+r1.id);
					System.out.println("name is: "+r1.name);
					System.out.println("percentage is: "+r1.percentage);
					System.out.println("............");
				}

				System.out.println("list_iterator");

				ListIterator<Student> it1=al.listIterator();
				while(it1.hasNext()) {
					Student r2= it1.next();
					System.out.println("id is: "+r2.id);
					System.out.println("name is: "+r2.name);
					System.out.println("percentage is: "+r2.percentage);
					System.out.println("............");
				}
					System.out.println("backward");
					while(it1.hasPrevious()) {
						Student r3= it1.previous();
						System.out.println("id is: "+r3.id);
						System.out.println("name is: "+r3.name);
						System.out.println("percentage is: "+r3.percentage);
						System.out.println("............");

					}
				}
			
		
	}


