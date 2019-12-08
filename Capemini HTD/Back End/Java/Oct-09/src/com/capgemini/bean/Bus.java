package com.capgemini.bean;

public class Bus {  //immutable

	private final String name; //final is optional and final will give only getter method
	private final int seat;
	public Bus(String name, int seats) {
		super();
		this.name = name;
		this.seat = seats;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSeat() {
		return seat;
		
	}
}
