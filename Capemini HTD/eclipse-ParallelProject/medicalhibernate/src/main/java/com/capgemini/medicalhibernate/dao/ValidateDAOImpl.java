package com.capgemini.medicalhibernate.dao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDAOImpl implements ValidateDAO{
	Pattern pat = null;
	Matcher mat = null;
	
	public boolean usernameValidation(String email) {
		pat = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		mat = pat.matcher(email);
		if(mat.matches()) {
			return true;
		}
		return false;
	}
	
	public boolean passwordValidation(String password) {
		pat = Pattern.compile("\\w+");
		mat = pat.matcher(password);
		if(mat.matches()) {
			return true;
		}
		return false;
	}

	public boolean mobileValidation(String mobile) {
		pat = Pattern.compile("\\d{10}");
		mat = pat.matcher(mobile);
		if(mat.matches()) {
			return true;
		}
		return false;
	}
}