package com.capgemini.factory;

import com.capgemini.dao.UserDAO;

import com.capgemini.dao.UserDAOImpl;

public class UserFactory {
	private UserFactory() 
	{

	}

	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOImpl();
		return dao;
	}
}


