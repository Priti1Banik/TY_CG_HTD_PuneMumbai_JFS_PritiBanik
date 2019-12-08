package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {

	void display(ArrayList<Student> k) {

		for(Student s:k) {
			System.out.println("ID is: "+s.id);
			System.out.println("Name is: "+s.name);
			System.out.println("Percentage is: "+s.percentage);
			System.out.println("...........................");
		}
	}
	void onlyPass(ArrayList<Student> k) {
		Iterator<Student> it = k. iterator();

		while(it.hasNext()){
			Student s = it.next();

			if(s.percentage>=35) {
				System.out.println("ID is: "+s.id);
				System.out.println("Name is: "+s.name);
				System.out.println("Percentage is: "+s.percentage);
				System.out.println("...........................");
			}
		}

	}	

	void distinctPass(ArrayList<Student> k) {
		Iterator<Student> it = k. iterator();

		while(it.hasNext()){
			Student s = it.next();

			if(s.percentage>=70) {
				System.out.println("ID is: "+s.id);
				System.out.println("Name is: "+s.name);
				System.out.println("Percentage is: "+s.percentage);
				System.out.println("...........................");
			}
		}

	}
}



