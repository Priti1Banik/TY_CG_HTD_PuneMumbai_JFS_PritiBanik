package com.capgemini.stream.list;

import java.util.ArrayList;
import java.util.Comparator;
public class TestG {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(6);
		al.add(3);
		al.add(4);
		
		Comparator<Integer> comp=(i,j)->i.compareTo(j);
		Integer small = al.stream().min(comp).get();
		System.out.println("small is: "+small);
		
		Integer large = al.stream().max(comp).get();
		System.out.println("large is: "+large);
		
}
}