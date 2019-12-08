package com.capgemini.priti;

import java.util.function.Predicate;

public class Test2 {
	public static void main(String[] args) {
		
		Predicate<Student> p = i-> {
			if(i.percentage>=35) {
				return true;
			}
			else {
				return false;
			}
		};
Student a = new Student(1,"Abcde",33.89,'F');
		boolean res = p.test(a);
		System.out.println("result is: "+res);
	}
}


