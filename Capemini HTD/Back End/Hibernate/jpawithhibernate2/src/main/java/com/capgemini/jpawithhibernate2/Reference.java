package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;



public class Reference {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Movie data = entityManager.find(Movie.class,2);
		Student getData= entityManager.getReference(Student.class,2);

		System.out.println("Id is: "+getData.getRoll_no());
		System.out.println("Name is: "+getData.getName());
		System.out.println("Rating is: "+getData.getPercentage());
	}
}

