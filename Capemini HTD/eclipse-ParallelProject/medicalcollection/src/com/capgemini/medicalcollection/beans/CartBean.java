package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class CartBean implements Serializable{
	private int uid;    
	private int pid;   
	private int cartid; 
	private String pname;
	private double price;
	
	public CartBean(int uid, int pid, int cartid, String pname, double price) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.cartid = cartid;
		this.pname = pname;
		this.price = price;
	}
	public CartBean() {
		super();
		
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartBean [uid=" + uid + ", pid=" + pid + ", cartid=" + cartid + ", pname=" + pname + ", price=" + price
				+ "]";
	}
	
}