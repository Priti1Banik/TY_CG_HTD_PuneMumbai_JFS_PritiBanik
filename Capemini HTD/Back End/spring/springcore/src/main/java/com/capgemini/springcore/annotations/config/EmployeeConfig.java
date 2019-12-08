package com.capgemini.springcore.annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.beans.DepartmentBean;
import com.capgemini.springcore.annotations.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(1);
		employeeBean.setEmpName("Priti");
		return employeeBean;
	}
	
//	@Bean(name="dev")
//	public DepartmentBean getDevDept() {
//		DepartmentBean bean = new DepartmentBean();
//		bean.setDeptId(901);
//		bean.setDeptName("Developer");
//		return bean;
//	}
//	
//	@Bean(name="testing")
//	public DepartmentBean getTestDept() {
//		DepartmentBean bean = new DepartmentBean();
//		bean.setDeptId(902);
//		bean.setDeptName("Testing");
//		return bean;
//	}
//	
//	@Bean(name="rnd")
//	//@Primary
//	public DepartmentBean getHrDept() {
//		DepartmentBean bean = new DepartmentBean();
//		bean.setDeptId(903);
//		bean.setDeptName("RnD");
//		return bean;
//	}
}
