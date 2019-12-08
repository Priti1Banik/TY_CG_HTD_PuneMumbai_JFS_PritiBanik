package com.capgemini.collectionframwork.sorting;

//import java.util.Comparator;

public class Bank  {

	int pin;
	String name;
	long micr;
	public Bank(int pin, String name, long micr) {
		super();
		this.pin = pin;
		this.name = name;
		this.micr = micr;
		
		
	}
	/*@Override
	public int compareTo(Bank b) {
		if (this.pin>b.pin) {
			return 1;
		}else if(this.pin<b.pin) {
			return -1;
		}else {
			return 0;
		}
	}*/
	
}
	

	