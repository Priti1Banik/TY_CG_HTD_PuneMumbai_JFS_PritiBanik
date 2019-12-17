package com.capgemini.medicalcollection.beans;

import java.io.Serializable;

public class MedicineBean implements Serializable{
	
	private int code;
	private String name;
	private double price;
	private int quantity;
	private String category;
	
	public MedicineBean(int code, String name, double price, int quantity, String category) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public MedicineBean() {
		super();
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "MedicineBean [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
}
