package com.capgemini.medicalhibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.medicalhibernate.beans.AdminResponseBean;
import com.capgemini.medicalhibernate.beans.CartBean;
import com.capgemini.medicalhibernate.beans.MedicalBean;
import com.capgemini.medicalhibernate.beans.UserRegistration;
import com.capgemini.medicalhibernate.dao.MedicalDAOImpl;

public class MedicineTest {
	MedicalDAOImpl implementation = new MedicalDAOImpl(); 
	@Test
	public void adminLoginTest() {
		boolean i = implementation.adminLogin("priti1", "guitar");
		assertEquals(true, i);
	}
	
	@Test
	public void userLoginTest() {
		boolean i = implementation.userLogin("priti@gmail.com", "priti1");
		assertEquals(true, i);
	}
	
	@Test
	public void registerTest() {
		UserRegistration i = implementation.registerUser("shital@gmail.com", "shital12","234650078");
		assertEquals(null, i);
	}
	
	@Test
	public void insertMedicineTest() {
		MedicalBean i = implementation.insertMedicine(27,"cebamed",234,13,"healthcare");
		assertEquals(null, i);
	}
	
//	@Test
//	public void getMedicineTest() {
//		MedicalBean i = implementation.getMedicine(1);
//		assertEquals(null, i);
//	}
	
	@Test
	public void updateMedicineTest() {
		MedicalBean i = implementation.updateMedicine(8,278,12);
		assertEquals(null, i);
	}
	
	@Test
	public void deleteMedicineTest() {
		MedicalBean i = implementation.deleteMedicine(8);
		assertEquals(null, i);
	}
	
	@Test
	public void deleteUserTest() {
		UserRegistration i = implementation.deleteUser(2);
		assertEquals(null, i);
	}
	
//	@Test
//	public void getResponseTest() {
//		AdminResponseBean i = implementation.getResponse(5);
//		assertEquals(null, i);
//	}
	
	@Test
	public void deleteFromCartTest() {
		CartBean i = implementation.deleteMedicine1(24);
		assertEquals(null, i);
	}
	
	@Test
	public void paymentTest() {
		CartBean i = implementation.payment(1);
		assertEquals(null, i);
	}
}
