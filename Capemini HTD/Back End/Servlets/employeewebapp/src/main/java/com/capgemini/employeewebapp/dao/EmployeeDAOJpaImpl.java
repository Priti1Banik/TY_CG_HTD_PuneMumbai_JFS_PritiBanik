package com.capgemini.employeewebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.employeewebapp.beans.EmployeeInfoBean;

public class EmployeeDAOJpaImpl implements EmployeeDAO{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePersistenceUnit");
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
		
		
		return false;
	}

}//end of class
