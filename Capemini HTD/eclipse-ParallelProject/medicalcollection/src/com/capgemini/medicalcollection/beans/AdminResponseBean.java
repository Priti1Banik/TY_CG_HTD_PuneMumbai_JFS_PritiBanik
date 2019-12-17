package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class AdminResponseBean implements Serializable{
	private int id;
	private String response;

	public AdminResponseBean(int id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	
	public AdminResponseBean() {
		super();
		
	}
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

	@Override
	public String toString() {
		return "AdminResponseBean [id=" + id + ", response=" + response + "]";
	}
}
