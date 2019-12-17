package com.capgemini.medicalcollection.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalcollection.beans.AdminResponseBean;
import com.capgemini.medicalcollection.beans.AdminUserLogin;
import com.capgemini.medicalcollection.beans.CartBean;
import com.capgemini.medicalcollection.beans.MedicineBean;
import com.capgemini.medicalcollection.beans.OrderMedicineBean;
import com.capgemini.medicalcollection.beans.UserRegistration;
import com.capgemini.medicalcollection.beans.UserRequestBean;
import com.capgemini.medicalcollection.factory.ValidateFactory;


public class DAOImpl implements MedicineDAO{
	static HashSet<MedicineBean> list = null;   //HashSet is used because it doesn't accept duplicate value and each product should be unique
	static List<UserRegistration> list1 =null;  //ArrayList supports duplicate elements
	static AdminUserLogin al = null;
	static List<UserRequestBean> list2 = null;
	static List<AdminResponseBean> list3 = null;
	static List<CartBean> list4 = null;
	static List<OrderMedicineBean> list5 = null;
	Scanner sc = new Scanner(System.in);

	//Static block...!!!!!!!!
	static {
		list = new HashSet<MedicineBean>();
		MedicineBean p1 = new MedicineBean(1,"Amtac",73.95,17,"Healthcare");
		MedicineBean p2 = new MedicineBean(2,"Unienzyme",23,12,"Healthcare");
		MedicineBean p3 = new MedicineBean(3,"Mederma",476.45,4,"Skincare");
		MedicineBean p4 = new MedicineBean(4,"Baby Cream",65,8,"Babycare");
		MedicineBean p5 = new MedicineBean(5,"Zenitac",17,20,"Healthcare");

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		al = new AdminUserLogin(1,"priti1","guitar");

		list1 = new ArrayList<UserRegistration>();
		UserRegistration a1 = new UserRegistration(1,"priti@gmail.com","priti1","1234987607");
		UserRegistration a2 = new UserRegistration(2,"abc@gmail.com","abcd","2087678919");
		UserRegistration a3 = new UserRegistration(3,"sneha@gmail.com","sneha","2318044420");
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);

		list2 = new ArrayList<UserRequestBean>();
		UserRequestBean u1 = new UserRequestBean(1,"Not getting product on mentioned date");
		UserRequestBean u2 = new UserRequestBean(2,"I need more quantity of the product which i ordered");
		UserRequestBean u3 = new UserRequestBean(3,"Service is very good");
		list2.add(u1);
		list2.add(u2);
		list2.add(u3);

		list3 = new ArrayList<AdminResponseBean>();
		AdminResponseBean ar1 = new AdminResponseBean(1,"We will look what is the issue for late delivery and let you know.");
		AdminResponseBean ar2 = new AdminResponseBean(2,"Okay..We surely send you how you want once you confirmed you order again.");
		AdminResponseBean ar3 = new AdminResponseBean(3,"Thank You for your Feedback.");
		list3.add(ar1);
		list3.add(ar2);
		list3.add(ar3);

		list4 = new ArrayList<CartBean>();
		CartBean c1 = new CartBean(1,2,1,"Unienzyme",23);
		CartBean c2 = new CartBean(1,1,2,"Amtac",73.95);
		CartBean c3 = new CartBean(3,5,3,"Zenitac",17);
		list4.add(c1);
		list4.add(c2);
		list4.add(c3);

		list5 = new ArrayList<OrderMedicineBean>();
		OrderMedicineBean o1 = new OrderMedicineBean(1,1,1,"Unienzyme",5,115);
		OrderMedicineBean o2 = new OrderMedicineBean(2,2,1,"Amtac",3,221.85);
		OrderMedicineBean o3 = new OrderMedicineBean(3,3,2,"Zenitac",10,170);
		list5.add(o1);
		list5.add(o2);
		list5.add(o3);
	}

	@Override
	public void getAllProduct() {

		for(MedicineBean medicine: list) {
			System.out.println("Code is: "+medicine.getCode());
			System.out.println("Name is: "+medicine.getName());
			System.out.println("Price is: "+medicine.getPrice());
			System.out.println("Quantity is: "+medicine.getQuantity());
			System.out.println("Category is: "+medicine.getCategory());
			System.out.println("............");
		}
	}

	//Implementation of MedicineDAO......!!!!!!!!!!
	@Override
	public void addProduct() {
		try {
			System.out.println("Enter the number of element you want to add");
			int count = Integer.parseInt(sc.nextLine());
			for (int i=1;i<=count;i++) {
				System.out.println("Enter the code");
				int code = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the name");
				String name = sc.nextLine();
				System.out.println("Enter the price");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the quantity");
				int quantity = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the category");
				String category = sc.nextLine();

				MedicineBean mb = new MedicineBean(code,name,price,quantity,category);
				list.add(mb);
				if(list != null) {
					System.out.println("Data Inserted");
				}
				else {
					System.out.println("Data cannot be inserted...!!");
				}
			}
		}catch(Exception e) {
			System.out.println("Enter valid code..!!!");
		}
	}

	@Override
	public boolean adminLogin() {
		System.out.println("Enter the username--");
		String username = sc.nextLine();
		System.out.println("Enter password--");
		String password = sc.nextLine();
		if(username.equals(al.getUsername())&&password.equals(al.getPassword())) {
			System.out.println("Logged In");
			return true;
		}
		else {
			System.out.println("...............");
		}
		return false;
	}

	@Override
	public void removeProduct() {
		try {
			System.out.println("Enter the medicine code which you want to delete");
			int code = Integer.parseInt(sc.nextLine());
			MedicineBean medicalBean = null;
			for(MedicineBean mb:list) {
				if(mb.getCode()==code) {
					medicalBean = mb;
				}
				if(medicalBean!=null) {
					list.remove(medicalBean);
					System.out.println("Medicine removed...!!");
				}
			}
		}catch(Exception e) {
			System.out.println("Enter valid code..!!!");
		}
	}

	@Override
	public boolean updateProduct(int code,double price,int quantity) {
		int check = 0;
		boolean isUpdated = false;
		MedicineBean medicineBean = new MedicineBean();
		for (MedicineBean list : list) {
			if (code == list.getCode()) {
				medicineBean = list;
				check++;
			}
		}
		if (check != 0) {
			medicineBean.setPrice(price);
			medicineBean.setQuantity(quantity);
			isUpdated = true;
		} else {
			System.out.println("Inalid Medicine ID");
		}
		return isUpdated;
	}

	@Override
	public void getProduct(int code) {
		MedicineBean medicine =null;
		for (MedicineBean list : list) {
			if (code == list.getCode()) {
				medicine=list;	
			}
		}
		if(medicine != null) {
			System.out.println("Code is: "+medicine.getCode());
			System.out.println("Name is: "+medicine.getName());
			System.out.println("Price is: "+medicine.getPrice());
			System.out.println("Quantity is: "+medicine.getQuantity());
			System.out.println("Category is: "+medicine.getCategory());
			System.out.println("............");
		}
		else {
			System.out.println("Code is not valid..!!");
		}
	}

	@Override
	public void userRegister() {
		System.out.println("Enter the number of element you want to add");
		try {
			ValidateDAO val = ValidateFactory.getInstance();
			UserRegistration ur1 = new UserRegistration();
			int count = Integer.parseInt(sc.nextLine());
			for (int i=1;i<=count;i++) {
				System.out.println("Enter the userid");
				int userid = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the username");
				String username = sc.nextLine();
				if (val.usernameValidation(username)) {
					ur1.setUsername(username);
				} else {
					System.out.println("Enter valid username");
					String email2 = sc.nextLine();
					//System.exit(0);
				}
				System.out.println("Enter the password");
				Scanner sc1 = new Scanner(System.in);
				String password = sc1.nextLine();
				if (val.passwordValidation(password)) {
					ur1.setPassword(password);
				} else {
					System.out.println("Enter valid password");
					String password1 = sc1.nextLine();
					//System.exit(0);
				}
				System.out.println("Enter the mobile");
				String mobile = sc.nextLine();
				if (val.mobileValidation(mobile)) {
					ur1.setMobile(mobile);
				} else {
					System.out.println("Enter valid mobile number");
					String mobile1 = sc.nextLine();
					//System.exit(0);
				}

				UserRegistration ur = new UserRegistration(userid,username,password,mobile);
				list1.add(ur);
				if(list1 != null) {
					System.out.println("User Registered");
					System.out.println("Registered user have following data-----");
					System.out.println("Userid is: "+ur.getUserid());
					System.out.println("Username is: "+ur.getUsername());
					System.out.println("Password is: "+ur.getPassword());
					System.out.println("Mobile is: "+ur.getMobile());
					System.out.println("............");
				}
				else {
					System.out.println("User already registered.!!!");
				}
			}
		}catch(Exception e) {
			System.out.println("Enter proper details..!!");
		}
	}

	@Override
	public void showAllUser() {
		for(UserRegistration userRegister: list1) {
			System.out.println("Userid is: "+userRegister.getUserid());
			System.out.println("Username is: "+userRegister.getUsername());
			System.out.println("Password is: "+userRegister.getPassword());
			System.out.println("Mobile is: "+userRegister.getMobile());
			System.out.println("............");
		}

	}

	@Override
	public void deleteUser() {
		try {
			System.out.println("Enter the user id which you want to delete");
			int userid = Integer.parseInt(sc.nextLine());
			UserRegistration userRegistration = null;
			for(UserRegistration mb:list1) {
				if(mb.getUserid()==userid) {
					userRegistration = mb;
				}
				if(userRegistration!=null) {
					list1.remove(userRegistration);
					System.out.println("User removed...!!");
				}
				else {
					System.out.println("User not removed..!!");
				}
			}
		}catch(Exception e) {
			System.out.println("Enter valid code..!!!");
		}	
	}

	@Override
	public boolean userLogin(String username, String password) {
		for(UserRegistration userRegistration:list1) {
			if(username.equals(userRegistration.getUsername())) {
				if(password.equals(userRegistration.getPassword())) {
					System.out.println("Logged In");
				}
				return true;
			}
			else {
				System.out.println("..........");
			}
		}
		return false;
	}

	@Override
	public boolean updateUser(int userid, String username, String password, String mobile) {
		int check = 0;
		boolean isUpdated = false;
		UserRegistration userRegistration = new UserRegistration();
		for (UserRegistration list : list1) {
			if (userid == list.getUserid()) {
				userRegistration = list;
				check++;
			}
		}
		if (check != 0) {
			userRegistration.setUsername(username);
			userRegistration.setPassword(password);
			userRegistration.setMobile(mobile);
			isUpdated = true;
		} else {
			System.out.println("Inalid User ID");
		}
		return isUpdated;
	}

	@Override
	public void getUpdatedUser(int userid) {
		UserRegistration userRegistration =null;
		for (UserRegistration list : list1) {
			if (userid == list.getUserid()) {
				userRegistration=list;	
			}
		}
		if(userRegistration != null) {
			System.out.println("Userid is: "+userRegistration.getUserid());
			System.out.println("Username is: "+userRegistration.getUsername());
			System.out.println("Password is: "+userRegistration.getPassword());
			System.out.println("Mobile number is: "+userRegistration.getMobile());
			System.out.println("User updated..!!!");
		}
		else {
			System.out.println("User not updated...");
		}
	}

	@Override
	public void addMessage() {
		try {
			System.out.println("Enter the number of element you want to add");
			int count = Integer.parseInt(sc.nextLine());
			for (int i=1;i<=count;i++) {
				System.out.println("Enter the userid");
				int userid = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the message");
				String usermessage = sc.nextLine();

				UserRequestBean userRequest = new UserRequestBean(userid,usermessage);
				list2.add(userRequest);
				if(list2 != null) {
					System.out.println("Message Sent..!!");
					System.out.println("-----------------");
					System.out.println("Your Id is---");
					System.out.println("Userid is: "+userRequest.getUserid());
					System.out.println("and your message---");
					System.out.println("Usermessage is: "+userRequest.getUsermessage());
				}
				else {
					System.out.println("Message not sent..");
				}
			}
		}catch(Exception e) {
			System.out.println("Enter proper details..!!");
		}
	}


	@Override
	public void getAllMessage() {
		for(UserRequestBean userRequestBean: list2) {
			System.out.println("Userid is: "+userRequestBean.getUserid());
			System.out.println("Message is: "+userRequestBean.getUsermessage());
			System.out.println("................");
		}
	}

	@Override
	public void putResponse() {
		try {
		System.out.println("Enter the number of element you want to add");
		int count = Integer.parseInt(sc.nextLine());
		for (int i=1;i<=count;i++) {
			System.out.println("Enter the id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the response");
			String response = sc.nextLine();

			AdminResponseBean adminResponse = new AdminResponseBean(id,response);
			list3.add(adminResponse);
			if(list3 != null) {
				System.out.println("Response Sent to ----");
				System.out.println("Userid is: "+adminResponse.getId());
				System.out.println("Response is ----");
				System.out.println("Usermessage is: "+adminResponse.getResponse());
			}
			else {
			System.out.println("Response not sent..!!");	
			}
		}
		}catch(Exception e) {
			System.out.println("Enter valid data..!!");
		}
	}

	@Override
	public void getResponse(int id) {
		AdminResponseBean adminResponseBean = null;
		for (AdminResponseBean list : list3) {
			if (id == list.getId()) {
				adminResponseBean=list;	
			}
		}
		if(adminResponseBean != null) {
			System.out.println("Code is: "+adminResponseBean.getId());
			System.out.println("Name is: "+adminResponseBean.getResponse());
			System.out.println("............");
		}
		else {
			System.out.println("Enter correct id..");
		}
	}

	@Override
	public void addToCart() {
		try {
		System.out.println("Enter the number of product you want to add");
		int count = Integer.parseInt(sc.nextLine());
		for (int i=1;i<=count;i++) {
			System.out.println("Enter the userid");
			int uid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the cartid");
			int cartid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter medicine name");
			String pname = sc.nextLine();
			MedicineBean medicineBean = null;
			for(MedicineBean medicine:list) {
				if(medicine.getName().equals(pname)) {
					medicineBean = medicine;
				}
			}
			int pid = medicineBean.getCode();
			double price = medicineBean.getPrice();

			if(list4 != null) {
				CartBean cartBean = new CartBean(uid,pid,cartid,pname,price);
				list4.add(cartBean);
				System.out.println("Medicine Inserted ..!!");
				System.out.println("-----------------");
				System.out.println("The medicine which is inserted to cart is ----");
				System.out.println("UserId is: "+cartBean.getUid());
				System.out.println("Product Id is: "+cartBean.getPid());
				System.out.println("Cart Id is: "+cartBean.getCartid());
				System.out.println("Product name is: "+cartBean.getPname());
				System.out.println("Price is: "+cartBean.getPrice());
				System.out.println("............");
			}
			else {
				System.out.println("Medicine not inserted..");
			}
		}
		}catch(Exception e) {
			System.out.println("Enter proper code..!!");
		}
	}

	@Override
	public void deleteFromCart() {
		try {
		System.out.println("Enter the cartid--");
		int cartid = Integer.parseInt(sc.nextLine());
		CartBean cartBean = null;
		for(CartBean cb:list4) {
			if(cb.getCartid()== cartid) {
				cartBean = cb;
			}
//			else {
//				System.out.println("Enter proper name..");
//			}
			if(cartBean!=null) {
				list4.remove(cartBean);
				System.out.println("Medicine removed from cart.");
			}
			else {
				System.out.println("Medicine not removed..!!");
			}
		}
		}catch(Exception e) {
			System.out.println("Enter valid choice for cartid..!!");
		}
	}

	@Override
	public void showItemAddedToCart(int id) {
		CartBean cartBean = null;
		for (CartBean list : list4) {
			if (id == list.getUid()) {
				cartBean=list;	
			}

			if(cartBean != null) {
				System.out.println("UserId is: "+cartBean.getUid());
				System.out.println("Product Id is: "+cartBean.getPid());
				System.out.println("Cart Id is: "+cartBean.getCartid());
				System.out.println("Product name is: "+cartBean.getPname());
				System.out.println("Price is: "+cartBean.getPrice());
				System.out.println("............");
			}
		}
	}

	@Override
	public void orderFromCart(int userid) {
		try {
		System.out.println("Enter the number of product you want to buy---");
		int count = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=count;i++) {
			System.out.println("Enter cartid");
			int cartid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter order id");
			int orderid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter total quantity of medicine");
			int quantity = Integer.parseInt(sc.nextLine());

			CartBean cartBean = null;
			for(CartBean list:list4) {
				if(cartid == list.getCartid() && userid == list.getUid()) {
					cartBean = list;
					OrderMedicineBean orderMedicineBean = new OrderMedicineBean(orderid,cartid,userid,cartBean.getPname(),quantity,cartBean.getPrice());
					list5.add(orderMedicineBean);
					System.out.println("Order is confirmed....!!!!!");
				}
				else {
					System.out.println("Order is not confirmed..");
				}
			}
		}
		}catch(Exception e) {
			System.out.println("Enter proper ccart id...");
		}
	}
	static ArrayList<OrderMedicineBean> list6 = null;
	@Override
	public double billGeneration(int userid) {
		list6 = new ArrayList<OrderMedicineBean>();
		for(OrderMedicineBean orderMedicineBean:list5) {
			if(userid == orderMedicineBean.getUserid()) {
				list6.add(orderMedicineBean);
			}
		}
		double totalBill = 0;
		if(!list6.isEmpty()) {
			for(OrderMedicineBean list:list5) {
				System.out.println("Order Id is: "+list.getOrderid());
				System.out.println("Cart Id is: "+list.getCartid());
				System.out.println("Product Name is: "+list.getMedicineName());
				double price = list.getPrice();
				System.out.println("Product price :"+price);
				int quantity = list.getQuantity();
				System.out.println("Mention Quantity: "+quantity);
				double bill = price*quantity;
				totalBill = totalBill+bill;
				System.out.println("-------------------");
			}
			System.out.println("Total Bill is Rs."+totalBill);	
		}
		return totalBill;
	}
}





