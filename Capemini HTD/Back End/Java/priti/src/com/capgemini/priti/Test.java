package com.capgemini.priti;

import java.util.ArrayList;



public class Test {
	public static void main(String[] args) {
		
	Student s1 = new Student(1,"Ronit",73.95,'M');
	Student s2 = new Student(2,"Ankita",70.65,'F');
	Student s3 = new Student(3,"Aniket",33.65,'M');
	Student s4 = new Student(4,"Pia",65.65,'F');
	Student s5 = new Student(5,"Priyanka",29.70,'F');
	Student s6 = new Student(6,"Nil",70.65,'M');
	Student s7 = new Student(7,"Kabir",76.45,'M');
	Student s8 = new Student(8,"Piyali",65.65,'F');
	
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	al.add(s6);
	al.add(s7);
	al.add(s8);
	
Helper h = new Helper();
/*h.displayAll(al);
System.out.println("***************************");
h.displayPassed(al);
System.out.println("***************************");
h.displayFailed(al);
System.out.println("***************************");
h.displayPassedwithGender(al,'F');
System.out.println("***************************");
h.displayFailedwithGender(al,'M');*/
System.out.println("***************************");
h.displayTopper(al);
}
}