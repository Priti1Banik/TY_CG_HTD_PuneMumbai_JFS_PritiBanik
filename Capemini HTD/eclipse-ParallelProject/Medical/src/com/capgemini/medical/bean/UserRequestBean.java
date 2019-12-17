package com.capgemini.medical.bean;

import java.io.Serializable;

public class UserRequestBean implements Serializable{
	private int userid;
	private String usermessage;
	
	
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
}
