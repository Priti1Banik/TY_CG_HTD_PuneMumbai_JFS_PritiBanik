package com.capgemini.medicalspringrest.dao;


import java.util.List;

import com.capgemini.medicalspringrest.beans.AdminInfoBean;
import com.capgemini.medicalspringrest.beans.AdminResponseBean;
import com.capgemini.medicalspringrest.beans.AdminUserBean;
import com.capgemini.medicalspringrest.beans.CartBean;
import com.capgemini.medicalspringrest.beans.MedicineInfoBean;
import com.capgemini.medicalspringrest.beans.UserInfoBean;
import com.capgemini.medicalspringrest.beans.UserRequestBean;

public interface MedicalDAO {
	public AdminInfoBean authenticate(String username, String password);
	public UserInfoBean authenticate1(String username, String password);
	public boolean addUser(UserInfoBean userInfoBean);
	public List<UserInfoBean> getAllUser();
	public boolean addProduct(MedicineInfoBean medicineInfoBean);
	public boolean updateProduct(MedicineInfoBean medicineInfoBean);
	public boolean deleteProduct(int code);
	public boolean deleteUser(int userid);
	public MedicineInfoBean getProduct(int code);
	public List<MedicineInfoBean> getAllProduct();
	public boolean updateUser(UserInfoBean userInfoBean);
	public List<MedicineInfoBean> getAllProduct1();
	public MedicineInfoBean getProduct1(int code);
	public CartBean addMedicine(int userid,String pname); 
	public CartBean removeMedicine(int cartid);
	public double payment(int uid);
	public boolean putMessage(UserRequestBean userRequestBean);
	public List<UserRequestBean> getMessage();
	public boolean putResponse(AdminResponseBean adminResponseBean);
	public AdminResponseBean getResponse(int id);


}
