package com.capgemini.collectionframwork.sorting;

import java.util.Comparator;

public class ById implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		if(o1.pin>o2.pin)
		{
			return 1;
		}
		else if(o1.pin<o2.pin)
		{
			return -1;
		}
		else 
		{
		return 0;	
		}
	}

}
