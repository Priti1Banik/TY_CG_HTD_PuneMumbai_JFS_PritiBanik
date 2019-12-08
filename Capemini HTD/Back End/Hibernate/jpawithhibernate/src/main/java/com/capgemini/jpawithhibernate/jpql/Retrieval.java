package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.caggemini.jpawithhibernate.dto.Movie;

public class Retrieval {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	String jpql = "from Movie";
	Query query = entityManager.createQuery(jpql);
	
	List<Movie> list = query.getResultList();    //this will give list of result
	
	
	for(Movie m: list) {
	System.out.println("Id is: "+m.getId());
	System.out.println("Name is: "+m.getName());
	System.out.println("Rating is: "+m.getRating());
	}
}
}
