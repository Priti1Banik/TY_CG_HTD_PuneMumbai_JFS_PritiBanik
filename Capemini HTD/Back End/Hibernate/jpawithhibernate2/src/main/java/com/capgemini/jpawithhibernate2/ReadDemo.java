package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;



public class ReadDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Student data = entityManager.find(Student.class,2);
	System.out.println("Id is: "+data.getRoll_no());
	System.out.println("Name is: "+data.getName());
	System.out.println("Rating is: "+data.getPercentage());
}
}
