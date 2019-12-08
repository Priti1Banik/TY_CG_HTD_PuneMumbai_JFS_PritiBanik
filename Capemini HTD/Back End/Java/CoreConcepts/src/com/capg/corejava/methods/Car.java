package com.capg.corejava.methods;

public class Car {
	String name;
	String colour;
	double price;
	public Car(String name, String colour, double price) {//parameterized constructor
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	
	public Car(String name) {
		this.name = name;
	}

	public Car(double price) {
		this.price = price;
	}

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Car(double price,String name) {//oder argument is diff. than the previous constructor
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() { //print the details of the car
		return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	

}
