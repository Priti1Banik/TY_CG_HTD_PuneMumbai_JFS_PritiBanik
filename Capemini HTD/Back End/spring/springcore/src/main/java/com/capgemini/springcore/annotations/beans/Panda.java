package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal{

	@Override
	public void eat() {
	System.out.println("Eating Bamboo");
	}

	@Override
	public void speak() {
		System.out.println("Panda squeaks");
	}

	@Override
	public void walk() {
		System.out.println("Panda is walking");
	}

}
