package com.capgemini.springrest.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("employeeInfo")
@XmlRootElement(name ="employee-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="employee_info")
@JsonPropertyOrder({"employeeId","name","designation"})
@JsonInclude(JsonInclude.Include.NON_DEFAULT)  //this will not include empty value or default value
public class EmployeeInfoBean {
	
	@JsonProperty("employeeId")
	@XmlElement(name="emp-id")
	@Column(name="emp_id")
	@Id
	private int empId;

	@JsonProperty("name")
	@XmlElement(name="emp-name")
	@Column(name="emp_name")
	private String empName;
	@XmlElement
	@Column
	private int age;
	@XmlElement
	@Column
	private double salary;
	@XmlElement
	@Column
	private String designation;
	@XmlElement
	@Column
	private String gender;
	@XmlElement
	@Column
	private long mobile;
	//@XmlTransient   //this will make password not visible in xml file
	//@JsonIgnore    //this will make password not visible in json file
	@XmlElement
	@Column
	private String password;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}//end of class
