package com.capgemini.medicalcollection.dao;

public interface MedicineDAO {
	public boolean adminLogin();
	public void getAllProduct();
	public void addProduct();
	public void removeProduct();
	public boolean updateProduct(int code,double price,int quantity);
	public void getProduct(int code);
	public void userRegister();
	public void showAllUser();
	public void deleteUser();
	public boolean userLogin(String username, String password);
	public boolean updateUser(int userid,String username,String password,String mobile);
	public void getUpdatedUser(int userid);
	public void addMessage();
	public void getAllMessage();
	public void putResponse();
	public void getResponse(int id);
	public void addToCart();
	public void deleteFromCart();
	public void showItemAddedToCart(int id);
	public void orderFromCart(int userid);
	public double billGeneration(int userid);
}
