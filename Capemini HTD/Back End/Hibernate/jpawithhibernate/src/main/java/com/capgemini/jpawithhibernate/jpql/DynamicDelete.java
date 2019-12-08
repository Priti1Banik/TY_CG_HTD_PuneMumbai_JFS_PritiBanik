package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "delete Movie where id=:mid";

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Query query = entityManager.createQuery(jpql);
		
		query.setParameter("mid",3);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result= "+result);


		entityManager.close();
	}
}
