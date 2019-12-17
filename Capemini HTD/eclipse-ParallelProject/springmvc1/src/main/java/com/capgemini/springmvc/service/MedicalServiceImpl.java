package com.capgemini.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.beans.AdminInfoBean;
import com.capgemini.springmvc.beans.AdminResponseBean;
import com.capgemini.springmvc.beans.CartBean;
import com.capgemini.springmvc.beans.MedicineInfoBean;
import com.capgemini.springmvc.beans.UserInfoBean;
import com.capgemini.springmvc.beans.UserRequestBean;
import com.capgemini.springmvc.dao.MedicalDAO;

@Service
public class MedicalServiceImpl implements MedicalService{

	@Autowired
	private MedicalDAO dao;

	@Override
	public boolean addUser(UserInfoBean userInfoBean) {
		return dao.addUser(userInfoBean);
	}

	@Override
	public AdminInfoBean authenticate(String username, String password) {
		return dao.authenticate(username, password);
	}

	@Override
	public boolean addProduct(MedicineInfoBean medicineInfoBean) {
		return dao.addProduct(medicineInfoBean);
	}

	@Override
	public boolean updateProduct(MedicineInfoBean medicineInfoBean) {
		return dao.updateProduct(medicineInfoBean);
	}

	@Override
	public boolean deleteProduct(int code) {
		return dao.deleteProduct(code);
	}

	@Override
	public boolean deleteUser(int userid) {
		return dao.deleteUser(userid);
	}

	@Override 
	public MedicineInfoBean getProduct(int code) { 
		if(code>0) { 
			return dao.getProduct1(code);
		}else {
			return null;
		} 
	}

	@Override
	public List<MedicineInfoBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public UserInfoBean authenticate1(String username, String password) {
		return dao.authenticate1(username, password);
	}

	@Override
	public List<MedicineInfoBean> getAllProduct1() {
		return dao.getAllProduct1();
	}


	@Override public MedicineInfoBean getProduct1(int code) {
		if(code>0) { 
			return dao.getProduct1(code); 
		}else { 
			return null; 
		}
	}

	@Override
	public boolean updateUser(UserInfoBean userInfoBean) {
		return dao.updateUser(userInfoBean);
	}

	@Override
	public boolean putMessage(UserRequestBean userRequestBean) {
		return dao.putMessage(userRequestBean);
	}

	@Override
	public List<UserRequestBean> getMessage() {
		return dao.getMessage();
	}

	@Override
	public boolean putResponse(AdminResponseBean adminResponseBean) {
		return dao.putResponse(adminResponseBean);
	}

	@Override
	public AdminResponseBean getResponse(int id) {
		return dao.getResponse(id);
	}

	@Override
	public CartBean addMedicine(CartBean cartBean) {
		return dao.addMedicine(cartBean);
	}

	@Override
	public CartBean removeMedicine(CartBean cartBean) {
		return dao.removeMedicine(cartBean);
	}

	@Override
	public double payment(int uid) {
		return dao.payment(uid);
	}
}