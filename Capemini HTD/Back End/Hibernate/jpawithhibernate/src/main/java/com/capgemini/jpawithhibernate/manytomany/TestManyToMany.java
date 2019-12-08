package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {
	public static void main(String[] args) {


		Course c = new Course();
		c.setCid(101);
		c.setCname("SQL");

		Course c1 = new Course();
		c.setCid(102);
		c.setCname("JDBC");

		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);

		Student s = new Student();
		s.setSid(1);
		s.setName("ABCD");
		s.setCourse(al);

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager =  entitymanagerfactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(s);
		/*Course course = entityManager.find(Course.class,101);
		course.getStudent().get(0).getSid();*/
		transaction.commit();
		
	}
}
