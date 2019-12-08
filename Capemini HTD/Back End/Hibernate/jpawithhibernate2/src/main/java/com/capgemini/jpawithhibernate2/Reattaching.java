package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;


public class Reattaching {
	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		try    
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();  
			transaction.begin();    //insert data in DB
			Student data = entityManager.find(Student.class,3);    
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			//entityManager.clear();                             //it will detach all the object in the persistent context
			System.out.println(entityManager.contains(data));
			Student m = entityManager.merge(data);

			System.out.println(entityManager.contains(m));

			/*	data.setName("ABCD2");
			data.setRating("Not Good");

			//entityManager.remove(data);                          
			//entityManager.persist(movie);
			System.out.println("record updated");*/

			transaction.commit();   
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}
}







