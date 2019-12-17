package com.capgemini.medical.dao;

public interface ValidateDAO {
	
	public boolean usernameValidation(String email);
    public boolean passwordValidation(String password);
	public boolean mobileValidation(String mobile);

}
