package com.capgemini.jdbc.dao;

public class UserFactory {

	private UserFactory() 
	{
		
	}
	
	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOJDBCImpl();
		return dao;
	}
}
