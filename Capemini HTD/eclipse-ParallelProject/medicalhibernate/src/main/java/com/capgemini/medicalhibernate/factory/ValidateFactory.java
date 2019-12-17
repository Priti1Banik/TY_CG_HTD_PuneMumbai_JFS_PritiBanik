package com.capgemini.medicalhibernate.factory;

import com.capgemini.medicalhibernate.dao.ValidateDAO;
import com.capgemini.medicalhibernate.dao.ValidateDAOImpl;

public class ValidateFactory {

	private ValidateFactory() {

	}
	public static ValidateDAO getInstance() {
		ValidateDAO dao = new ValidateDAOImpl();
		return dao;
	}
}
