package com.capgemini.stream;

import java.util.Comparator;

public class ByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
	}

}
