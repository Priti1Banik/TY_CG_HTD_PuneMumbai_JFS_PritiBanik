package com.capgemini.corejava.classobject;

public class Student {
	String name;
	int id;
	double percentage;
	public Student(String name, int id, double percentage) {
		
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
			@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
	}
	

}
