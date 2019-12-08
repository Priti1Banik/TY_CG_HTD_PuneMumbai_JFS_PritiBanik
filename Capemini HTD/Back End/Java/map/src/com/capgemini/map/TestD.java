package com.capgemini.map;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
		
		hm.put("Ondu",1);
		hm.put("Idhu",5);
		hm.put("Hathu",10);
		hm.put("Eredu",2);
		
		System.out.println("***********keys***********");
		
		Set<String> s = hm.keySet();
		
		for(String r: s) {
			System.out.println(r);
		}
		
		System.out.println("*********values*********");
		
		Collection<Integer> c = hm.values();
		
		for(Integer r:c) {
			System.out.println(r);
		}
		
		
		
	}
	}