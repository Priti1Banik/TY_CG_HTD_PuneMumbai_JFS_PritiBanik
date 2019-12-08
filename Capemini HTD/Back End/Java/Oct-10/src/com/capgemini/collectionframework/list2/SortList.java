package com.capgemini.collectionframework.list2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add('P');
		al.add('E');
		al.add('R');
		al.add('I');
		
		Collections.shuffle(al);
		System.out.println(al);
}
}