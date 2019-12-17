package com.capgemini.medical.dao;

import com.capgemini.medical.bean.AdminResponseBean;
import com.capgemini.medical.bean.CartBean;
import com.capgemini.medical.bean.MedicalBean;
import com.capgemini.medical.bean.UserRegistration;
import com.capgemini.medical.bean.UserRequestBean;

public interface MedicalDAO {

	public MedicalBean getAllMedicine();
	public MedicalBean getMedicine(int code);
	public MedicalBean insertMedicine(int code,String name,double price,int quantity,String category);
	public MedicalBean updateMedicine(int code,double price,int quantity);
	public MedicalBean deleteMedicine(int code);
	public UserRegistration deleteUser(int userid);
	public boolean checkAdminUserLogin(String username,String password);
	public UserRegistration registerUser(int userid,String email,String password,int mobile);
	public boolean userLogin(String email,String password);
	public MedicalBean getMedicine(String name);
	public CartBean addMedicine(int userid);
	public CartBean removeMedicine(String name);
	public CartBean payment(int userid);
	public UserRegistration reset(int userid,String password);
	public UserRequestBean putMessage(int userid,String usermessage);
	public AdminResponseBean putResponse(String response,int id);
	public UserRequestBean getMessage();
	public AdminResponseBean getResponse(int id);
}
