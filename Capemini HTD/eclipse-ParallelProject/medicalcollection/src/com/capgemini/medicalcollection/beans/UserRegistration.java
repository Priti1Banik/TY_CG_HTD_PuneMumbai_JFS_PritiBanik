package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class UserRegistration implements Serializable{

	private int userid;
	private String username;
	private String password;
	private String mobile;
	
	public UserRegistration(int userid, String username, String password, String mobile) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
	}
	public UserRegistration() {
		super();
	}
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserRegistration [userid=" + userid + ", username=" + username + ", password=" + password + ", mobile="
				+ mobile + "]";
	}	
	
}
