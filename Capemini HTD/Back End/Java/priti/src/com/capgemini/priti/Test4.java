package com.capgemini.priti;

import java.util.function.Function;

public class Test4 {
public static void main(String[] args) {
	
	Function<Integer,Student> f = i-> {
	Student s = new Student();
	s.id=i;
	return s;
	};
	
	Student s = f.apply(10);
	
	System.out.println("Id is: "+s.id);
	System.out.println("Name is: "+s.name);
	System.out.println("Percentage is: "+s.percentage);

	
	
}
}
