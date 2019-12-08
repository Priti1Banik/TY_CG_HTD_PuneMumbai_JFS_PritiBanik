package com.capgemini.priti;

import java.util.function.Predicate;

public class Test1 {
public static void main(String[] args) {
	
	Predicate<Integer> p = i-> {
		if(i%2==0) {
			return false;
		}
		else {
			return true;
		}
	};
	
	boolean res = p.test(10);
	System.out.println("result is: "+res);
}
}
