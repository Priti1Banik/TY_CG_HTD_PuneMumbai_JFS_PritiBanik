package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotations.config.PetConfig;
import com.capgemini.springcore.annotations.beans.Pet;

public class AnimalTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();
		pet.getAnimal().walk();
	}
}
