package com.capgemini.priti;

import java.util.function.Consumer;

public class Test6 {
public static void main(String[] args) {
	
	Consumer<Student> c = (s)-> {
		System.out.println("Id is: "+s.id);
		System.out.println("Name is: "+s.name);
		System.out.println("Percentage is: "+s.percentage);

	};
		Student s1 = new Student(1,"Pqrs",76.89,'F');
		c.accept(s1);
}
}
