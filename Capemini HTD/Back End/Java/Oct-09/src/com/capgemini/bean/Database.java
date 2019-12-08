package com.capgemini.bean;

public class Database {
void recieve(Student t) {
	System.out.println("i am database");
	System.out.println("Name is: "+t.getName());
	System.out.println("ID is: "+t.getId());
	System.out.println("Height is:"+t.getHeight());
}

void recieve(Employee e) {
	System.out.println("i am again data base");
	System.out.println("Id is: "+e.getId());
	System.out.println("Name is: "+e.getName());
	System.out.println("Salary is: "+e.getSalary());
	System.out.println("Role is: "+e.getRole());
	System.out.println("Department is: "+e.getDepartment());
}
}
