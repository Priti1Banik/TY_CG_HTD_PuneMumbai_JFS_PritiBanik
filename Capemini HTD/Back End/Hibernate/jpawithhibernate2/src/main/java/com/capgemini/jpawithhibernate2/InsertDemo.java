package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Student;



public class InsertDemo {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		Student student = new Student();
		student.setRoll_no(2);
		student.setName("MNOP");
		student.setPercentage(92);
		
		try    //try-catch block is used because if there any exception comes during inserting data then it will be handled
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			 transaction=entityManager.getTransaction();  
			transaction.begin();    //insert data in DB
			entityManager.persist(student);
			System.out.println("record saved");
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