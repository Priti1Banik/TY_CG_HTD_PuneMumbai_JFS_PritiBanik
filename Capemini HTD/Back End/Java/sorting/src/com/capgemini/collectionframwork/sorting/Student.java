package com.capgemini.collectionframwork.sorting;

import java.util.ArrayList;



public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;


	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		
	}

// Logic for auto boxing to compare
	@Override
	public int compareTo(Student s) {
		Double k = this.percentage;
		Double t = s.percentage;
		return k.compareTo(t);
	}

	

	/*@Override
	public int compareTo(Student s) {
		String k = this.name;
		String t = s.name;
		int res = k.compareTo(t);
		return res;
		return this.name.compareTo(s.name) *-1;//(*-1)->it will return result descending order
	}
*/
//  logic to compare according to Percentage
	/*@Override
	public int compareTo(Student s) {
		if(this.percentage>s.percentage) 
		{
			return 1;
		} 
		else if(this.percentage<s.percentage) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}*/

	
	
	
	
	
	
	
	
		// logic to sort student by ID
		/*@Override
	public int compareTo(Student s) {
		if(this.id>s.id) 
		{
			return 1;
		} 
		else if(this.id<s.id) 
		{
			return -1;
			}
		else {
		return 0;
	}
	}*/
	}	
	







