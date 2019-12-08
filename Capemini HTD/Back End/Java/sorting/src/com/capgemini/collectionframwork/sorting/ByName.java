package com.capgemini.collectionframwork.sorting;

import java.util.Comparator;

public class ByName implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.name.compareTo(o2.name);
	}
}
