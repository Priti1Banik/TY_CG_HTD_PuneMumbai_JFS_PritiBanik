package com.capgemini.medical.bean;

import java.io.Serializable;

public class UserRegistration implements Serializable{

	private int userid;
	private String username;
	private String password;
	private int mobile;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}		
}
