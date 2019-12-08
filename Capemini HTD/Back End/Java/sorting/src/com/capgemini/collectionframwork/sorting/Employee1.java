package com.capgemini.collectionframwork.sorting;

public class Employee1 implements Comparable<Employee1> {
 int id;
 String name;
 double salary;
public Employee1(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public int compareTo(Employee1 e) {
	if(this.id>e.id)
	{
		return 1;
	}
	else if(this.id<e.id)
	{
		return -1;
	}
	else
	{
		return 0;
	}
}

 
}
