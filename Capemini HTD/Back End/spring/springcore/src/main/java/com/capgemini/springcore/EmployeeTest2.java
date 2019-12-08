package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);

		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);

		System.out.println("Enter the employee Id: ");
		int empId1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee name: ");
		String empName1 = sc.nextLine();

		emp1.setEmpId(empId1);
		emp1.setEmpName(empName1);

		System.out.println("Emp-1 Id =" +emp1.getEmpId());
		System.out.println("Emp-1 Name =" +emp1.getEmpName());
		
		EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class);

		System.out.println("Enter the employee Id: ");
		int empId2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee name: ");
		String empName2 = sc.nextLine();

		emp2.setEmpId(empId2);
		emp2.setEmpName(empName2);
		
//		System.out.println("Emp-1 Id =" +emp1.getEmpId());       -->spring by default create singleton object so these 2 lines will not give output of emp2 by overridding
//		System.out.println("Emp-1 Name =" +emp1.getEmpName()); this can be overcome by using scope="prototype" in bean tag of employeeConfig.xml
		System.out.println("Emp-2 Id =" +emp2.getEmpId());
		System.out.println("Emp-2 Name =" +emp2.getEmpName());

	}
}
