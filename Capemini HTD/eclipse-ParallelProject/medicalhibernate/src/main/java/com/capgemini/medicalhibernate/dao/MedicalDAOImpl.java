package com.capgemini.medicalhibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.medicalhibernate.beans.AdminResponseBean;
import com.capgemini.medicalhibernate.beans.AdminUserLogin;
import com.capgemini.medicalhibernate.beans.CartBean;
import com.capgemini.medicalhibernate.beans.MedicalBean;
import com.capgemini.medicalhibernate.beans.UserRegistration;
import com.capgemini.medicalhibernate.beans.UserRequestBean;




public class MedicalDAOImpl implements MedicalDAO{

	public MedicalBean getAllMedicine() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from MedicalBean";
		Query query = entityManager.createQuery(jpql);

		List<MedicalBean> list = query.getResultList();   

		for(MedicalBean m: list) {
			System.out.println("Id = "+m.getCode());
			System.out.println("Name = "+m.getName());
			System.out.println("Price = "+m.getPrice());
			System.out.println("Quantity = "+m.getQuantity());
			System.out.println("Category = "+m.getCategory());
		}
		entityManager.close();
		return null;
	}

	public MedicalBean getMedicine(int code) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MedicalBean data = entityManager.find(MedicalBean.class,code);
		System.out.println("Id = "+data.getCode());
		System.out.println("Name = "+data.getName());
		System.out.println("Price = "+data.getPrice());
		System.out.println("Quantity = "+data.getQuantity());
		System.out.println("Category = "+data.getCategory());

		return data; 
	}
	public MedicalBean insertMedicine(int code, String name, double price, int quantity, String category) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		MedicalBean medicine = new MedicalBean();
		medicine.setCode(code);
		medicine.setName(name);
		medicine.setPrice(price);
		medicine.setQuantity(quantity);
		medicine.setCategory(category);

		try {
			ts.begin();
			entityManager.persist(medicine);
			ts.commit();
		}catch(Exception e) {
			System.out.println("Code not present..!!");
			//e.printStackTrace();
		}
		entityManager.close();

		return null;

	}

	public MedicalBean updateMedicine(int code, double price, int quantity) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "update MedicalBean set price=:pr, quantity=:qn where code=:md";
		EntityTransaction ts = entityManager.getTransaction();
		ts.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("pr",price);
		query.setParameter("qn",quantity);
		query.setParameter("md",code);
		int result = query.executeUpdate();
		ts.commit();
		System.out.println("result= "+result);
		entityManager.close();
		return null;
	}

	public MedicalBean deleteMedicine(int code) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from MedicalBean where code=:cd";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("cd",code);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result= "+result);
		entityManager.close();
		return null;
	}

	public boolean adminLogin(String username, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from AdminUserLogin where username = :username and password = :password";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("username",username);
		query.setParameter("password",password);

		AdminUserLogin adminUserLogin = null;
		try {
			adminUserLogin = (AdminUserLogin) query.getSingleResult();
			return true;
		}
		catch(Exception e) {
			System.out.println("Details are not appropiate..");
			//e.printStackTrace();
		}
		return false;
	}

	public UserRegistration deleteUser(int userid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from UserRegistration where userid=:cd";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("cd",userid);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result= "+result);
		entityManager.close();
		return null;
	}

	public UserRequestBean getAllMessage() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from UserRequestBean";
		Query query = entityManager.createQuery(jpql);

		List<UserRequestBean> list = query.getResultList();   

		for(UserRequestBean m: list) {
			System.out.println("User Id = "+m.getUserid());
			System.out.println("User Message = "+m.getUsermessage());
		}
		entityManager.close();
		return null;
	}

	public AdminResponseBean putResponse(int id, String response) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		AdminResponseBean adminResponse = new AdminResponseBean();
		adminResponse.setId(id);
		adminResponse.setResponse(response);
		try {
			ts.begin();
			entityManager.persist(adminResponse);
			ts.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();

		return null;
	}

	public UserRegistration registerUser(String username,String password,String mobile) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		UserRegistration registration = new UserRegistration();
		registration.setUsername(username);
		registration.setPassword(password);
		registration.setMobile(mobile);

		try {
			ts.begin();
			entityManager.persist(registration);
			ts.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	public boolean userLogin(String username, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from UserRegistration where username = :username and password = :password";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("username",username);
		query.setParameter("password",password);

		UserRegistration userRegistration = null;
		try {
			userRegistration = (UserRegistration) query.getSingleResult();
			return true;
		}
		catch(Exception e) {
			System.out.println("Credentials incorrect..!!!");
			//e.printStackTrace();
		}
		return false;
	}

	public UserRegistration reset(int userid,int mobile, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "update UserRegistration set password=:pwd, mobile=:mb where userid=:uid";
		EntityTransaction ts = entityManager.getTransaction();
		ts.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("pwd",password);
		query.setParameter("mb",mobile);
		query.setParameter("uid",userid);
		int result = query.executeUpdate();
		ts.commit();
		System.out.println("result= "+result);
		entityManager.close();
		return null;
	}

	public AdminResponseBean getResponse(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		AdminResponseBean response = entityManager.find(AdminResponseBean.class,id);
		System.out.println("Id = "+response.getId());
		System.out.println("Response = "+response.getResponse());
		return response; 
	}

	public UserRequestBean putMessage(int userid, String usermessage) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		UserRequestBean userRequest = new UserRequestBean();
		userRequest.setUserid(userid);
		userRequest.setUsermessage(usermessage);
		try {
			ts.begin();
			entityManager.persist(userRequest);
			ts.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();

		return null;
	}

	public CartBean addMedicine(int userid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		ts.begin();
		String jpql1 = "select u from UserRegistration u where userid =:userid";
		Query query1 = entityManager.createQuery(jpql1);
		query1.setParameter("userid",userid);

		System.out.println("Enter product name");
		Scanner sc = new Scanner(System.in);
		String medicinename = sc.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		int uid = userRegistration.getUserid();
		String jpql2 = "select medicine from MedicalBean medicine where name=: nm";
		Query query2 = entityManager.createQuery(jpql2);
		query2.setParameter("nm", medicinename);
		List<MedicalBean> list = query2.getResultList();
		for(MedicalBean medicine: list) {
			int code = medicine.getCode();
			double price = medicine.getPrice();
			String name = medicine.getName();

			CartBean cart = new CartBean();
			cart.setPid(code);
			cart.setPname(name);
			cart.setPrice(price);
			cart.setUid(userid);
			

			entityManager.persist(cart);
			ts.commit();
		}
		return null;
	}

	public CartBean deleteMedicine1(int cartid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from CartBean where cartid=:cd";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("cd",cartid);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result= "+result);
		entityManager.close();
		return null;
	}

	public CartBean payment(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select sum(price) from CartBean where uid=:cd";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("cd",uid);
		List<Double> list = query.getResultList();
		for(Double c: list) {
			double bill = c.doubleValue();
			System.out.println("Bill = " +bill);
		}
		transaction.commit();
		entityManager.close();
		return null;
	}
}








