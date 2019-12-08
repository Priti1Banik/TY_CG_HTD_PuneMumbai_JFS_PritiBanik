package com.capgemini.priti;

import java.util.function.Supplier;

public class Test5 {
public static void main(String[] args) {
	Supplier<Student> a =()-> new Student();
	
	Student s = a.get();
	Student p = a.get();
	
	System.out.println(s);
	System.out.println(p);
}
}
