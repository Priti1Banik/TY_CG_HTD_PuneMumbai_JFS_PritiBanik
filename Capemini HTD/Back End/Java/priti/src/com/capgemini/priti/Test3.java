package com.capgemini.priti;

import java.util.function.Function;

public class Test3 {
public static void main(String[] args) {
	Function<Integer,Integer> f=i->i*i;
	
	int ans=f.apply(30);
	System.out.println(ans); 
}
}
