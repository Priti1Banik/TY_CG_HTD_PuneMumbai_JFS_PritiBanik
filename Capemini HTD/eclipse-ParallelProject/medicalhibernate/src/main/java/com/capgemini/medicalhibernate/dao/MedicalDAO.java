package com.capgemini.medicalhibernate.dao;

import com.capgemini.medicalhibernate.beans.AdminResponseBean;
import com.capgemini.medicalhibernate.beans.CartBean;
import com.capgemini.medicalhibernate.beans.MedicalBean;
import com.capgemini.medicalhibernate.beans.UserRegistration;
import com.capgemini.medicalhibernate.beans.UserRequestBean;


public interface MedicalDAO {

	public boolean adminLogin(String username,String password);
	public MedicalBean getAllMedicine();
	public MedicalBean getMedicine(int code);
	public MedicalBean insertMedicine(int code, String name, double price, int quantity, String category);
	public MedicalBean updateMedicine(int code,double price,int quantity);
	public MedicalBean deleteMedicine(int code);
	public UserRegistration deleteUser(int userid);
	public UserRequestBean getAllMessage();
	public AdminResponseBean putResponse(int id, String response);
	public UserRegistration registerUser(String username,String password,String mobile);
	public boolean userLogin(String username,String password);
	public UserRegistration reset(int userid,int mobile,String password);
	public AdminResponseBean getResponse(int id);
	public UserRequestBean putMessage(int userid, String usermessage);
	public CartBean addMedicine(int userid);
	public CartBean deleteMedicine1(int cartid);
	public CartBean payment(int userid);
}
