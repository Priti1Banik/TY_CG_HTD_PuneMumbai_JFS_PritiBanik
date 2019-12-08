package com.capgemini.bean;

public class TestB {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setId(9);
	e.setName("Sam");
	e.setSalary(2545.65);
	e.setRole("Analyst");
	e.setDepartment("Research");
	Database db = new Database();
	db.recieve(e);
}
}
