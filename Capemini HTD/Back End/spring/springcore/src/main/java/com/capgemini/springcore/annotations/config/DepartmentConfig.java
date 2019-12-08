package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name="dev")
	public DepartmentBean getDevDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(901);
		bean.setDeptName("Developer");
		return bean;
	}
	
	@Bean(name="testing")
	public DepartmentBean getTestDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(902);
		bean.setDeptName("Testing");
		return bean;
	}
	
	@Bean(name="rnd")
	@Primary
	public DepartmentBean getHrDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(903);
		bean.setDeptName("RnD");
		return bean;
	}
	
}// end of class
