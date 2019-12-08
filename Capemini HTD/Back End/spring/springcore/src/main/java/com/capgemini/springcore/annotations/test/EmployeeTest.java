package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("Employee details---");
		System.out.println("Employee Id is : " +employeeBean.getEmpId());
		System.out.println("Employee Name is : " +employeeBean.getEmpName());
		System.out.println("Department Info---");
		System.out.println("Department Id is : " +employeeBean.getDeptBean().getDeptId());
		System.out.println("Department Name is : " +employeeBean.getDeptBean().getDeptName());
		//((AbstractApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
