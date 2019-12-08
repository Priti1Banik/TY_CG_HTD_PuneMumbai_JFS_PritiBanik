package com.capgemini.dao;

import com.capgemini.bean.UserBean1;

public interface UserDAO {
	
	public UserBean1 userLogin(int userid,String password);

	}
