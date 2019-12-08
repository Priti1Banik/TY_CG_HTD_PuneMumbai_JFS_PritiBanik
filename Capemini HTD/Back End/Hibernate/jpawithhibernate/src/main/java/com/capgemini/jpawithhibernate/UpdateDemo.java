package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caggemini.jpawithhibernate.dto.Movie;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		
		try    //try-catch block is used because if there any exception comes during inserting data then it will be handled
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();  
			transaction.begin();    //insert data in DB
			Movie data = entityManager.find(Movie.class,3);    //find the data to be update
			
			data.setName("ABCD2");
			data.setRating("Not Good");
			
			//entityManager.remove(data);                          
			//entityManager.persist(movie);
			System.out.println("record updated");
			transaction.commit();   //save the data in table
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}
}


		
		

