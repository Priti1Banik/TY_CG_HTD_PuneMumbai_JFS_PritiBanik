package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Modification {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "update Movie set name='Arjun Reddy' where id=2";

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result= "+result);


		entityManager.close();
	}
}
