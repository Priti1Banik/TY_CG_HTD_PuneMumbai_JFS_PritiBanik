package com.capgemini.priti;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	Comparator<Student> comp = (s1,s2)->
	{
		Double i = s1.percentage;
		Double j = s2.percentage;
		return i.compareTo(j);
	};
	void displayTopper(ArrayList<Student> al) {

Student s = al.stream().max(comp).get();

            System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	

	void displayPassed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i->i.percentage>=35).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	}

	void displayFailed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i->i.percentage<35).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	}

	void displayPassedwithGender(ArrayList<Student> al,char g) {
		List<Student> li = al.stream().filter(i->(i.percentage>=35 && i.gender==g)).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	}

	void displayFailedwithGender(ArrayList<Student> al,char g) {
		List<Student> li = al.stream().filter(i->(i.percentage<35 && i.gender==g)).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	}

	void displayAll(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("gender is: "+s.gender);
			System.out.println("*********************");
		}
	}
}