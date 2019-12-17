package com.capgemini.medicalspringrest.service;

import java.util.List;

import com.capgemini.medicalspringrest.beans.AdminInfoBean;
import com.capgemini.medicalspringrest.beans.AdminResponseBean;
import com.capgemini.medicalspringrest.beans.AdminUserBean;
import com.capgemini.medicalspringrest.beans.CartBean;
import com.capgemini.medicalspringrest.beans.MedicineInfoBean;
import com.capgemini.medicalspringrest.beans.UserInfoBean;
import com.capgemini.medicalspringrest.beans.UserRequestBean;

public interface MedicalService {
	public boolean addUser(UserInfoBean userInfoBean);
	public List<UserInfoBean> getAllUser();
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
	public CartBean addMedicine(int userid,String pname); 
	public CartBean removeMedicine(int cartid);
	public double payment(int uid);
	public boolean putMessage(UserRequestBean userRequestBean);
	public List<UserRequestBean> getMessage();
	public boolean putResponse(AdminResponseBean adminResponseBean);
	public AdminResponseBean getResponse(int id);
}
