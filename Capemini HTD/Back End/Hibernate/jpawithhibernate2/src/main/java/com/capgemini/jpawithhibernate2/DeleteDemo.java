package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;



public class DeleteDemo {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		try  
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();  
			transaction.begin();    //insert data in DB
			Student data = entityManager.find(Student.class,1);    
			entityManager.remove(data);                          
			System.out.println("record deleted");
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