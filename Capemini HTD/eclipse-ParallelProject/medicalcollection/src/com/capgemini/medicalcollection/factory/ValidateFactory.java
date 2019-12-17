package com.capgemini.medicalcollection.factory;

import com.capgemini.medicalcollection.dao.ValidateDAO;
import com.capgemini.medicalcollection.dao.ValidateDAOImpl;

public class ValidateFactory {

	private ValidateFactory() {

	}
	public static ValidateDAO getInstance() {
		ValidateDAO dao = new ValidateDAOImpl();
		return dao;
	}
}
