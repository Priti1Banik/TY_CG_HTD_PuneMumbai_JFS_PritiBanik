package com.capgemini.stream;

import java.util.Comparator;

public class ByHeight implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.height>e2.height) {
			return 1;
		}
		else if(e1.height<e2.height) {
			return -1;
		}
		else {
		return 0;
	}
	}
}
