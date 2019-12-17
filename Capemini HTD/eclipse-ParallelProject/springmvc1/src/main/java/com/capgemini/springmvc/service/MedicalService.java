package com.capgemini.springmvc.service;

import java.util.List;

import com.capgemini.springmvc.beans.AdminInfoBean;
import com.capgemini.springmvc.beans.AdminResponseBean;
import com.capgemini.springmvc.beans.CartBean;
import com.capgemini.springmvc.beans.MedicineInfoBean;
import com.capgemini.springmvc.beans.UserInfoBean;
import com.capgemini.springmvc.beans.UserRequestBean;

public interface MedicalService {
	public boolean addUser(UserInfoBean userInfoBean);
	public AdminInfoBean authenticate(String username, String password);
	public boolean addProduct(MedicineInfoBean medicineInfoBean);
	public boolean updateProduct(MedicineInfoBean medicineInfoBean);
	public boolean deleteProduct(int code);
	public boolean deleteUser(int userid);
	public MedicineInfoBean getProduct1(int code);
	public List<MedicineInfoBean> getAllProduct();
	public UserInfoBean authenticate1(String username, String password);
	public List<MedicineInfoBean> getAllProduct1();
	public MedicineInfoBean getProduct(int code);
	public boolean updateUser(UserInfoBean userInfoBean);
	
	public CartBean addMedicine(CartBean cartBean); 
	public CartBean removeMedicine(CartBean cartBean); 
	public double payment(int userid);
	
	public boolean putMessage(UserRequestBean userRequestBean);
	public List<UserRequestBean> getMessage();
	public boolean putResponse(AdminResponseBean adminResponseBean);
	public AdminResponseBean getResponse(int id);
}
