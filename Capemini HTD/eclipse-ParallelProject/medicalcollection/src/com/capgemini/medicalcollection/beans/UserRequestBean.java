package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class UserRequestBean implements Serializable{
	private int userid;
	private String usermessage;
	
	public UserRequestBean(int userid, String usermessage) {
		super();
		this.userid = userid;
		this.usermessage = usermessage;
	}
	public UserRequestBean() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsermessage() {
		return usermessage;
	}
	public void setUsermessage(String usermessage) {
		this.usermessage = usermessage;
	}
	@Override
	public String toString() {
		return "UserRequestBean [userid=" + userid + ", usermessage=" + usermessage + "]";
	}	
}
