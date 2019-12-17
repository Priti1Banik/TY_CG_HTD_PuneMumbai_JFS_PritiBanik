package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class OrderMedicineBean implements Serializable{
	private int orderid;
	private int cartid;
	private int userid;
	private String medicineName;
	private int quantity;
	private double price;
	
	public OrderMedicineBean(int orderid, int cartid, int userid, String medicineName, int quantity, double price) {
		super();
		this.orderid = orderid;
		this.cartid = cartid;
		this.userid = userid;
		this.medicineName = medicineName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderMedicineBean() {
		super();
		
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderMedicineBean [orderid=" + orderid + ", cartid=" + cartid + ", userid=" + userid + ", medicineName="
				+ medicineName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
