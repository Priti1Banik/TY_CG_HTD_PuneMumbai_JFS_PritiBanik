package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeeInfoBean;

@Repository    //this annotation show that this class connect with database
public class EmployeeDAOJpaImpl implements EmployeeDAO{
	
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	//private EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePersistenceUnit");
	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		manager.close();
		//emf.close();
		return employeeInfoBean;
	}// end of getEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId = :empId and password = :pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId",empId);
		query.setParameter("pwd",pwd);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;

	}// end of authenticate

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isAdded = false;
		try {
		ts.begin();
		manager.persist(employeeInfoBean);
		ts.commit();
		isAdded = true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		manager.close();
		
		return isAdded;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		EmployeeInfoBean employeeInfoBean2=manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		if(employeeInfoBean2 != null) {
			if(employeeInfoBean.getEmpName()!=null) {
				employeeInfoBean2.setEmpName(employeeInfoBean.getEmpName());
			}
			if(employeeInfoBean.getAge() !=0) {
				employeeInfoBean2.setAge(employeeInfoBean.getAge());
			}
			if(employeeInfoBean.getPassword() !=null) {
				employeeInfoBean2.setPassword(employeeInfoBean.getPassword());
			}
			if(employeeInfoBean.getDesignation() !=null) {
				employeeInfoBean2.setDesignation(employeeInfoBean.getDesignation());
			}
			if(employeeInfoBean.getGender()!=null) {
				employeeInfoBean2.setGender(employeeInfoBean.getGender());
			}
			if(employeeInfoBean.getMobile() !=0) {
				employeeInfoBean2.setMobile(employeeInfoBean.getMobile());
			}
			if(employeeInfoBean.getSalary() !=0) {
				employeeInfoBean2.setSalary(employeeInfoBean.getSalary());
			}
			
		}
		boolean isUpdate = false;
		try{ts.begin();
		manager.persist(employeeInfoBean2);
		ts.commit();
		isUpdate = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isUpdate;
	
	}

	public boolean deleteEmployee(int empId) {
		
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction ts = entityManager.getTransaction();
			ts.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			ts.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()



}//end of class
