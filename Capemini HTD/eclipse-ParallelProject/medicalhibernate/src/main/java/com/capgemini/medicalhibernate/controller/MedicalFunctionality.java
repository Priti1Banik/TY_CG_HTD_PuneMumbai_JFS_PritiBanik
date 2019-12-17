package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.beans.AdminResponseBean;
import com.capgemini.medicalhibernate.beans.CartBean;
import com.capgemini.medicalhibernate.beans.MedicalBean;
import com.capgemini.medicalhibernate.beans.UserRegistration;
import com.capgemini.medicalhibernate.beans.UserRequestBean;
import com.capgemini.medicalhibernate.dao.MedicalDAO;
import com.capgemini.medicalhibernate.dao.ValidateDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.factory.ValidateFactory;

public class MedicalFunctionality {
	public static void main(String[] args) {
		medicalPortal();
	}
	public static void medicalPortal() {
		System.out.println("Welcome to medical store...");
		System.out.println("Press A for admin login");
		System.out.println("Press B to register user");
		System.out.println("Press C for user login");
		Scanner sc = new Scanner(System.in);
		String button = sc.nextLine();

		if(button.equals("A")) {
			try {
				MedicalDAO mf = MedicineFactory.getInstance();
				System.out.println("Enter username");
				String username = sc.nextLine();
				System.out.println("Enter password");
				String password = sc.nextLine();
				boolean al = mf.adminLogin(username, password);

				if(al==true) {
					System.out.println("Logged in...!!!!");
					adminLogin1();
				}
				else {
					System.out.println("Enter valid credentials..");
				}
			}catch(Exception e) {
				System.out.println("Data not appropiate..!!!");
			}
		}
		else if(button.equals("B")) {
			System.out.println("Register Yourself..!!");
			MedicalDAO mf = MedicineFactory.getInstance();
			ValidateDAO val = ValidateFactory.getInstance();
			UserRegistration ur = new UserRegistration();
			System.out.println("Enter username");
			String username = sc.nextLine();
			if (val.usernameValidation(username)) {
				ur.setUsername(username);
			} else {
				System.out.println("Enter valid username");
				String email2 = sc.nextLine();
				//System.exit(0);
			}
			System.out.println("Enter password");
			String password = sc.nextLine();
			if (val.passwordValidation(password)) {
				ur.setPassword(password);
			} else {
				System.out.println("Enter valid password");
				String password1 = sc.nextLine();
				//System.exit(0);
			}
			System.out.println("Enter mobile");
			String mobile = sc.nextLine();
			if(val.mobileValidation(mobile)) {
				ur.setMobile(mobile);
				UserRegistration al = mf.registerUser(username,password,mobile);
			}else {
				System.out.println("Mobile number is not valid..");
				System.out.println("Enter proper mobile number");
				String mobile1 = sc.nextLine();
				UserRegistration al = mf.registerUser(username,password,mobile1);
			}
		}
		else if(button.equals("C")) {
			System.out.println("Please Login");
			MedicalDAO mf = MedicineFactory.getInstance();
			ValidateDAO val = ValidateFactory.getInstance();
			UserRegistration ur = new UserRegistration();
			System.out.println("Enter Username");
			String username = sc.nextLine();
			if (val.usernameValidation(username)) {
				ur.setUsername(username);
			} else {
				System.out.println("Enter valid username");
				String email2 = sc.nextLine();
				//System.exit(0);
			}
			System.out.println("Enter password");
			String password = sc.nextLine();
			if (val.passwordValidation(password)) {
				ur.setPassword(password);
			} else {
				System.out.println("Enter valid password");
				String password1 = sc.nextLine();
				//System.exit(0);
			}
			boolean al = mf.userLogin(username, password);

			if(al==true) {
				userLogin1();
			}
			else {
				System.out.println("Enter valid Data..");
			}
		}
		System.out.println("Enter correct choice..!!");
		medicalPortal();
	}
	public static void userLogin1() {
		System.out.println("Press A to product list");
		System.out.println("Press B to search a particular medicine");
		System.out.println("Press C to add medicine to cart");
		System.out.println("Press D to delete item from cart");
		System.out.println("Press E to place order");
		System.out.println("Press F for payment");
		System.out.println("Press G to update profile");
		System.out.println("Press H to enter the message");
		System.out.println("Press I to get response");
		System.out.println("Press J to logout");
		MedicalDAO mf = MedicineFactory.getInstance();
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		if(b.equals("A")) {
			MedicalBean m1 = mf.getAllMedicine();
			System.out.println(m1);
		}
		else if(b.equals("B")) {
			System.out.println("Enter the code of medicine which you want to see details - ");
			try {
				int code = Integer.parseInt(sc.nextLine());
				MedicalBean m2 = mf.getMedicine(code);
			}catch(Exception e) {
				System.out.println("code is not valid..");
			}
			//			int code = Integer.parseInt(sc.nextLine());
			//			MedicalBean m2 = mf.getMedicine(code);
			//			if(m2!=null) {
			//				System.out.println(m2);
			//			}else {
			//				System.out.println("Enter valid code..");
			//				adminLogin1();
			//			}
		}
		else if(b.equals("C")) {
			System.out.println("Enter User Id");
			try {
				int userid = Integer.parseInt(sc.nextLine());
				CartBean m3 = mf.addMedicine(userid);
			}catch(Exception e) {
				System.out.println("Enter correct userid...");
			}
		}else if(b.equals("D")) {
			System.out.println("Enter Cart Id");
			try {
				int cartid = Integer.parseInt(sc.nextLine());
				CartBean c = mf.deleteMedicine1(cartid);
			}catch(Exception e) {
				System.out.println("cartid is not valid..");
			}
		}
		else if(b.equals("E")) {
			System.out.println("Order placed.. Proceed to Pay");
		}
		else if(b.equals("F")) {
			System.out.println("Enter User Id");
			try {
				int uid = Integer.parseInt(sc.nextLine());
				CartBean c = mf.payment(uid);
			}catch(Exception e) {
				System.out.println("Enter proper userid..");
			}

		}
		else if(b.equals("G")) {
			try {
				System.out.println("Enter userid - ");
				int userid = Integer.parseInt(sc.nextLine());
				System.out.println("Enter mobile number - ");
				int mobile = Integer.parseInt(sc.nextLine());
				System.out.println("Enter password - ");
				String password = sc.nextLine();
				UserRegistration m4 = mf.reset(userid,mobile,password);
				System.out.println(m4);
			}catch(Exception e) {
				System.out.println("Enter proper userid..");
			}
		}
		else if(b.equals("H")) {
			System.out.println("Enter userid - ");
			try {
				int userid = Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("Enter valid userid..");
			}
			System.out.println("Enter userid again..");
			int userid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the message - ");
			String usermessage = sc.nextLine();
			UserRequestBean m8 = mf.putMessage(userid, usermessage);
			System.out.println(m8);
		}
		else if(b.equals("I")) {
			System.out.println("Enter userid - ");
			try {
				int id = Integer.parseInt(sc.nextLine());
				AdminResponseBean m7 = mf.getResponse(id);
				System.out.println(m7);
			}catch(Exception e) {
				System.out.println("Enter correct id...");
			}
			//		int id = Integer.parseInt(sc.nextLine());
			//		AdminResponseBean m7 = mf.getResponse(id);
			//		System.out.println(m7);
			//	}
		}else if(b.equals("J")) {
			System.out.println("Logout...");
		}
		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
		String p = sc.nextLine();
		if(p.equals("Yes")) {
			userLogin1();
		}
		else {
			System.out.println("THANK YOU..!!!");
		}
		sc.close();
	}
	public static void adminLogin1() {

		System.out.println("Press 1 to see all medicine");
		System.out.println("Press 2 see details of a particular medicine");
		System.out.println("Press 3 to insert medicine");
		System.out.println("Press 4 to update medicine");
		System.out.println("Press 5 to delete medicine");
		System.out.println("Press 6 to delete user");
		System.out.println("Press 7 to see all messages");
		System.out.println("Press 8 to give response");
		System.out.println("Press 9 to logout");
		MedicalDAO mf = MedicineFactory.getInstance();
		Scanner sc = new Scanner(System.in);
		int button = Integer.parseInt(sc.nextLine());
		if(button==1) {
			try {
				MedicalBean m1 = mf.getAllMedicine();
				System.out.println(m1);
			}catch(Exception e) {
				System.out.println("Enter valid choice..!!");
			}
		}
		else if(button==2) {
			System.out.println("Enter the code of medicine which you want to see details - ");
			int code = Integer.parseInt(sc.nextLine());
			MedicalBean m2 = mf.getMedicine(code);
			if(m2!=null) {
				System.out.println(m2);
			}else {
				System.out.println("Enter valid code..");
			}
		}
		else if(button==3) {
			try {
				System.out.println("Enter the code of medicine which you want to insert - ");
				int code = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the medicine name - ");
				String name = sc.nextLine();
				System.out.println("Enter the price of medicine - ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the quantity of medicine present in stock - ");
				int quantity = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the medicine category - ");
				String category = sc.nextLine();
				MedicalBean m3 = mf.insertMedicine(code, name, price, quantity, category);
				System.out.println(m3);
			}catch(Exception e) {
				System.out.println("Invalid code...Try again!!!");
				adminLogin1();
			}
		}
		else if(button==4) {
			try {
				System.out.println("Enter the code of medicine which you want to update - ");
				int code = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the new price of medicine - ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the updated quantity of medicine present in stock - ");
				int quantity = Integer.parseInt(sc.nextLine());
				MedicalBean m4 = mf.updateMedicine(code,price,quantity);
				System.out.println(m4);
			}catch(Exception e) {
				System.out.println("Try Again by inserting proper details..!!!");
				adminLogin1();
			}
		}
		else if(button==5){
			System.out.println("Enter the code of medicine which you want to delete - ");
			try {
				int code = Integer.parseInt(sc.nextLine());
				MedicalBean m5 = mf.deleteMedicine(code);
				System.out.println(m5);
			}catch(Exception e) {
				System.out.println("Code should be in digit... ");
			}
		}
		else if(button==6){
			System.out.println("Enter the userid of the user - ");
			try {
				int userid = Integer.parseInt(sc.nextLine());
				UserRegistration m5 = mf.deleteUser(userid);
				System.out.println(m5);
			}catch(Exception e) {
				System.out.println("Userid is not proper..");
			}
		}
		else if(button==7) {
			UserRequestBean m7 = mf.getAllMessage();
			System.out.println(m7);
		}
		else if(button==8) {
			System.out.println("Enter id for whom response have to be send - ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the response - ");
			String response = sc.nextLine();
			AdminResponseBean m8 = mf.putResponse(id, response);
			System.out.println(m8);
		}
		else if(button==9) {
			System.out.println("Logged out..");
		}
		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
			String p1 = sc.nextLine();
			if(p1.equals("Yes")) {
				adminLogin1();
			}
			else {
				System.out.println("THANK YOU..!!!");
				return;
			}
		sc.close();
	}
}
