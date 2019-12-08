package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caggemini.jpawithhibernate.dto.Movie;

public class Reference {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Movie data = entityManager.find(Movie.class,2);
		Movie getData= entityManager.getReference(Movie.class,2);

		System.out.println("Id is: "+getData.getId());
		System.out.println("Name is: "+getData.getName());
		System.out.println("Rating is: "+getData.getRating());
	}
}
