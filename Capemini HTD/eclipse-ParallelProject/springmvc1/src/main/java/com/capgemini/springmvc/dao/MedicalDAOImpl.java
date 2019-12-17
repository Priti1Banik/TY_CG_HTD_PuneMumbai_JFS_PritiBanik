package com.capgemini.springmvc.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springmvc.beans.AdminInfoBean;
import com.capgemini.springmvc.beans.AdminResponseBean;
import com.capgemini.springmvc.beans.CartBean;
import com.capgemini.springmvc.beans.MedicineInfoBean;
import com.capgemini.springmvc.beans.UserInfoBean;
import com.capgemini.springmvc.beans.UserRequestBean;

@Repository 
public class MedicalDAOImpl implements MedicalDAO{

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean addUser(UserInfoBean userInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isAdded = false;
		try {
			ts.begin();
			manager.persist(userInfoBean);
			ts.commit();
			isAdded = true;

		}catch(Exception e) {
			System.out.println("Invalid data..");
		}
		manager.close();

		return isAdded;
	}

	@Override
	public AdminInfoBean authenticate(String username, String password) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from AdminInfoBean where username = :username and password = :password";
		Query query = manager.createQuery(jpql);
		query.setParameter("username",username);
		query.setParameter("password",password);

		AdminInfoBean adminInfoBean = null;
		try {
			adminInfoBean = (AdminInfoBean) query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println("Wrong Credentials..");
		}
		return adminInfoBean;
	}// end of authenticate

	@Override
	public boolean addProduct(MedicineInfoBean medicineInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isAdded = false;
		try {
			ts.begin();
			manager.persist(medicineInfoBean);
			ts.commit();
			isAdded = true;

		}catch(Exception e) {
			System.out.println("Medicine not added..");
		}
		manager.close();

		return isAdded;
	}

	@Override
	public boolean updateProduct(MedicineInfoBean medicineInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		MedicineInfoBean medicineInfoBean2=manager.find(MedicineInfoBean.class, medicineInfoBean.getCode());
		if(medicineInfoBean2 != null) {
			if(medicineInfoBean.getName()!=null) {
				medicineInfoBean2.setName(medicineInfoBean.getName());
			}
			if(medicineInfoBean.getPrice() !=0) {
				medicineInfoBean2.setPrice(medicineInfoBean.getPrice());
			}
			if(medicineInfoBean.getQuantity() !=0) {
				medicineInfoBean2.setQuantity(medicineInfoBean.getQuantity());
			}
			if(medicineInfoBean.getCategory() !=null) {
				medicineInfoBean2.setCategory(medicineInfoBean.getCategory());
			}
		}
		boolean isUpdate = false;
		try{ts.begin();
		manager.persist(medicineInfoBean2);
		ts.commit();
		isUpdate = true;
		}catch(Exception e) {
			System.out.println("Update not possible..");
		}
		manager.close();
		return isUpdate;
	}

	@Override
	public boolean deleteProduct(int code) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medicinePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			MedicineInfoBean medicineInfoBean= entityManager.find(MedicineInfoBean.class, code);
			entityManager.remove(medicineInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			System.out.println("Not possible to delete product..");
		}
		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean deleteUser(int userid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medicinePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			UserInfoBean userInfoBean= entityManager.find(UserInfoBean.class, userid);
			entityManager.remove(userInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			System.out.println("User not deleted..");
		}
		entityManager.close();
		return isDeleted;
	}


	@Override public MedicineInfoBean getProduct(int code) {
		try {
		EntityManager manager = emf.createEntityManager(); 
		MedicineInfoBean medicineInfoBean = manager.find(MedicineInfoBean.class, code);
		manager.close(); 
		return medicineInfoBean; 
		}catch(Exception e){
		System.out.println("Medicine not found..");	
		}
		return null;
	}


	@Override
	public List<MedicineInfoBean> getAllProduct() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from MedicineInfoBean";
		Query query = manager.createQuery(jpql);

		List<MedicineInfoBean> productList = null;
		try {
			productList = query.getResultList();

		} catch (Exception e) {
			System.out.println("Products not found..");
		}
		return productList;

	}

	@Override
	public UserInfoBean authenticate1(String username, String password) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from UserInfoBean where username = :username and password = :password";
		Query query = manager.createQuery(jpql);
		query.setParameter("username",username);
		query.setParameter("password",password);

		UserInfoBean userInfoBean = null;
		try {
			userInfoBean = (UserInfoBean) query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println("Wrong Credentials..");
		}
		return userInfoBean;
	}// end of authenticate

	@Override
	public List<MedicineInfoBean> getAllProduct1() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from MedicineInfoBean";
		Query query = manager.createQuery(jpql);

		List<MedicineInfoBean> productList = null;
		try {
			productList = query.getResultList();

		} catch (Exception e) {
			System.out.println("List of product not found..");
		}
		return productList;
	}


	@Override
	public MedicineInfoBean getProduct1(int code) {
		try {
		EntityManager manager = emf.createEntityManager(); 
		MedicineInfoBean medicineInfoBean = manager.find(MedicineInfoBean.class, code);
		manager.close(); 
		return medicineInfoBean; 
		}catch(Exception e) {
			System.out.println("Product not found..");
		}
		return null;
	}
	@Override
	public boolean updateUser(UserInfoBean userInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		UserInfoBean userInfoBean2=manager.find(UserInfoBean.class, userInfoBean.getUserid());
		if(userInfoBean2 != null) {
			if(userInfoBean.getUsername()!=null) {
				userInfoBean2.setUsername(userInfoBean.getUsername());
			}
			if(userInfoBean.getPassword() !=null) {
				userInfoBean2.setPassword(userInfoBean.getPassword());
			}
			if(userInfoBean.getMobile() !=0) {
				userInfoBean2.setMobile(userInfoBean.getMobile());
			}
		}
		boolean isUpdate = false;
		try{ts.begin();
		manager.persist(userInfoBean2);
		ts.commit();
		isUpdate = true;
		}catch(Exception e) {
			System.out.println("User not updated..");
		}
		manager.close();
		return isUpdate;
	}

	@Override
	public boolean putMessage(UserRequestBean userRequestBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isAdded = false;
		try {
			ts.begin();
			manager.persist(userRequestBean);
			ts.commit();
			isAdded = true;

		}catch(Exception e) {
			System.out.println("Message not sent..");
		}
		manager.close();

		return isAdded;
	}

	@Override
	public List<UserRequestBean> getMessage() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from UserRequestBean";
		Query query = manager.createQuery(jpql);

		List<UserRequestBean> messageList = null;
		try {
			messageList = query.getResultList();

		} catch (Exception e) {
			System.out.println("Message list is not available...");
		}
		return messageList;

	}

	@Override
	public boolean putResponse(AdminResponseBean adminResponseBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isAdded = false;
		try {
			ts.begin();
			manager.persist(adminResponseBean);
			ts.commit();
			isAdded = true;

		}catch(Exception e) {
			System.out.println("Response not sent..");
		}
		manager.close();

		return isAdded;
	}

	@Override
	public AdminResponseBean getResponse(int id) {
		EntityManager manager = emf.createEntityManager(); 
		AdminResponseBean adminResponseBean = manager.find(AdminResponseBean.class, id);
		manager.close(); 
		return adminResponseBean; 
	}

	@Override
	public CartBean addMedicine(CartBean cartBean) {
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medicinePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction ts = entityManager.getTransaction();
		CartBean cart= null;
		ts.begin();
		String jpql1 = " from UserInfoBean where userid =:userid";
		Query query1 = entityManager.createQuery(jpql1);
		int userid = cartBean.getUid();
		query1.setParameter("userid",userid);

		UserInfoBean userInfoBean = new UserInfoBean();
		int uid = userInfoBean.getUserid();
		String jpql2	= "from MedicineInfoBean where name=:nm";
		Query query2 = entityManager.createQuery(jpql2);
		String pname = cartBean.getPname();
		query2.setParameter("nm", pname);
		List<MedicineInfoBean> list = query2.getResultList();
		for(MedicineInfoBean medicine: list) {
			int code = medicine.getCode();
			double price = medicine.getPrice();
			cart = new CartBean();
			cart.setPid(code);
			cart.setPname(pname);
			cart.setPrice(price);
			cart.setUid(userid);
			entityManager.persist(cart);
			ts.commit();
		}
		return cart;
		}catch (Exception e) {
			System.out.println("Medicine not added..");
		}
		return null;
	}

	@Override
	public CartBean removeMedicine(CartBean cartBean) {
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medicinePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from CartBean where cartid=:cd";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		int cartid = cartBean.getCartid();
		query.setParameter("cd",cartid);
		int result = query.executeUpdate();
		transaction.commit();
		entityManager.close();
		}catch (Exception e) {
			System.out.println("Medicine not delete from cart..");
		}
		return null;
	}

	@Override
	public double payment(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medicinePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select sum(price) from CartBean where uid=:uid";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("uid",uid);
		double bill = (Double) query.getSingleResult();
		transaction.commit();
		entityManager.close();
		return bill;
	}
}


