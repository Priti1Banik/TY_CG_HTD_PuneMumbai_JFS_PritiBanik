package com.capgemini.factory;

//import com.capgemini.dao.UserDAO;
import com.capgemini.dao.UserDAO1;
//import com.capgemini.dao.UserDAOImpl;
import com.capgemini.dao.UserDAOImpl1;

public class UserFactory1 {
	private UserFactory1() 
	{

	}

	public static UserDAO1 getInstance() {
		UserDAO1 dao = new UserDAOImpl1();
		return dao;
	}
}

