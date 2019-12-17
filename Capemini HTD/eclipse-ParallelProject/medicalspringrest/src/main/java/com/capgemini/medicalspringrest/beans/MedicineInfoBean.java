package com.capgemini.medicalspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class MedicineInfoBean implements Serializable{
	@Column
	@Id
	private int code;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private int quantity;
	@Column
	private String category;
	

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
	
}



