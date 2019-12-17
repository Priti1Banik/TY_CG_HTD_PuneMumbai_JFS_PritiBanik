package com.capgemini.medical.bean;

import java.io.Serializable;

public class CartBean implements Serializable{
	private int uid;    
	private int pid;   
	private int cartid; 
	private String pname;
	private String uname;
	private int price;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}