package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caggemini.jpawithhibernate.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		/*Movie movie = new Movie();
		movie.setId(2);
		movie.setName("Circus");
		movie.setRating("Average");*/

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.find(Movie.class,2);
		System.out.println("Id is: "+data.getId());
		System.out.println("Name is: "+data.getName());
		System.out.println("Rating is: "+data.getRating());
	
	}
}
