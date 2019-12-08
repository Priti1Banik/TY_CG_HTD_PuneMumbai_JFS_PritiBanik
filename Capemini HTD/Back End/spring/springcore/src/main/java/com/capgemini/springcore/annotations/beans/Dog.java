package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("eating pedrigree");
	}

	@Override
	public void speak() {
		System.out.println("Bhaw bhaw");
	}

	@Override
	public void walk() {
		System.out.println("Dog is running..");
	}

}
