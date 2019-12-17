package com.capgemini.medical.factory;

import com.capgemini.medical.dao.ValidateDAO;
import com.capgemini.medical.dao.ValidateDAOImpl;

public class ValidateFactory {

	private ValidateFactory() {

	}
	public static ValidateDAO getInstance() {
		ValidateDAO dao = new ValidateDAOImpl();
		return dao;
	}
}
