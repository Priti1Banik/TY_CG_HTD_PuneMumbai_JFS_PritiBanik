package com.capgemini.jpawithhibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestManyToOne {

	public static void main(String[] args) {


		PencilBox pencilbox = new PencilBox();
		pencilbox.setBoxid(7);
		pencilbox.setName("ABCD");
		

		PencilBox pencilbox1 = new PencilBox();
		pencilbox.setBoxid(8);
		pencilbox.setName("PQRS");

		Pencil pencil = new Pencil();
		pencil.setPid(5);
		pencil.setColor("Red");
		pencil.setPencilbox(pencilbox);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(6);
		pencil1.setColor("Black");
		pencil1.setPencilbox(pencilbox);
		
		

		pencil.setPencilbox(pencilbox);     

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();  
		transaction.begin();   
		entityManager.persist(pencil);
		entityManager.persist(pencil1);
		
		/*PencilBox pb = entityManager.find(PencilBox.class,1);
		System.out.println(pb.getBoxid());
		System.out.println(pb.getName());
		System.out.println(pb.get);
		System.out.println(pb.getPerson().getName());
*/
		System.out.println("record saved");
		transaction.commit();
	}
}
