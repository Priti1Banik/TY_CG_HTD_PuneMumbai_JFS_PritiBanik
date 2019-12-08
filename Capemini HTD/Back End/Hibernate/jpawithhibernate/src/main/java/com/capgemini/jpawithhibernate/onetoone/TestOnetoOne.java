package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestOnetoOne {
	public static void main(String[] args) {


		Person person = new Person();
		person.setPid(3);
		person.setName("ABCD");

		VoterCard votercard = new VoterCard();
		votercard.setVid(12345);
		votercard.setAddress("Durgapur");

		person.setVotercard(votercard);     

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();  
		transaction.begin();   
		//entityManager.persist(person);
		VoterCard data = entityManager.find(VoterCard.class,12345);
		System.out.println(data.getVid());
		System.out.println(data.getAddress());
		System.out.println(data.getPerson().getPid());
		System.out.println(data.getPerson().getName());

		System.out.println("record saved");
		transaction.commit();
	}
}