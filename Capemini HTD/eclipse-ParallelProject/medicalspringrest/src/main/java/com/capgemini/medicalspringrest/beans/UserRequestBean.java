package com.capgemini.medicalspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_request")
public class UserRequestBean implements Serializable{
	@Column
	@Id
	private int userid;
	@Column
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
