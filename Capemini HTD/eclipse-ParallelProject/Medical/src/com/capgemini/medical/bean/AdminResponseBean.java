package com.capgemini.medical.bean;

import java.io.Serializable;

public class AdminResponseBean implements Serializable{
	private int id;
	private String response;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
}
