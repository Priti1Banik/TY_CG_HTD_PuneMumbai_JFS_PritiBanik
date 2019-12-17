package com.capgemini.medical.controller;

import java.util.Scanner;

import com.capgemini.medical.bean.AdminResponseBean;
import com.capgemini.medical.bean.CartBean;
import com.capgemini.medical.bean.MedicalBean;
import com.capgemini.medical.bean.UserRegistration;
import com.capgemini.medical.bean.UserRequestBean;
import com.capgemini.medical.dao.MedicalDAO;
import com.capgemini.medical.dao.ValidateDAO;
import com.capgemini.medical.factory.MedicineFactory;
import com.capgemini.medical.factory.ValidateFactory;

public class MedicalFunctionality {

	public static void main(String[] args) {
		System.out.println("Welcome to medical store...");
		medicalStorePortal();
	}

	public static void medicalStorePortal() {
		System.out.println("Press A for admin login");
		System.out.println("Press B for user registration");
		System.out.println("Press C for user login");
		Scanner sc = new Scanner(System.in);
		String button = sc.nextLine();

		if (button.equals("A")) {
			MedicalDAO mf = MedicineFactory.getInstance();
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String password = sc.nextLine();
			boolean al = mf.checkAdminUserLogin(username, password);

			if (al == true) {
				adminLogin();
			} else {
				System.out.println("Enter correct credentials..");
				medicalStorePortal();
			}
		} else if (button.equals("B")) {
			System.out.println("Register Yourself..!!");
			MedicalDAO mf = MedicineFactory.getInstance();
			System.out.println("Enter id");
			int userid = 0;
			try {
				userid = Integer.parseInt(sc.nextLine());
				String s = Integer.toString(userid);
				ValidateDAO val = ValidateFactory.getInstance();
				UserRegistration ur = new UserRegistration();

				System.out.println("Enter email");
				String email = sc.nextLine();
				if (val.usernameValidation(email)) {
					ur.setUsername(email);
				} else {
					System.out.println("Enter valid email");
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
				int mobile = Integer.parseInt(sc.nextLine());
				UserRegistration al = mf.registerUser(userid, email, password, mobile);
			} catch (Exception e) {
				System.out.println("Enter valid user id...");
			}

			System.out.println("Do you want to proceed ?");
			System.out.println("Yes Or No");
			String p = sc.nextLine();
			if (p.equals("Yes")) {
				medicalStorePortal();
			} else {
				System.out.println("THANK YOU..!!!");
			}
		} else if (button.equals("C")) {
			System.out.println("Please Login");
			MedicalDAO mf = MedicineFactory.getInstance();

			ValidateDAO val = ValidateFactory.getInstance();
			UserRegistration ur = new UserRegistration();
			System.out.println("Enter email");
			String email = sc.nextLine();
			if (val.usernameValidation(email)) {
				ur.setUsername(email);
			} else {
				System.out.println("Enter valid email");
				String email1 = sc.nextLine();
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
			boolean al = mf.userLogin(email, password);
			System.out.println(al);
			if (al == true) {
				userLogin1();
			} else {
				System.out.println("Enter valid Credentials..");
				medicalStorePortal();
			}
		} else {
			System.out.println("Enter choice which are mentioned above...");
			medicalStorePortal();
		}
	}

	public static void userLogin1() {
		System.out.println("Press A to product list");
		System.out.println("Press B to search a particular medicine");
		System.out.println("Press C to add medicine to cart");
		System.out.println("Press D to delete item from cart");
		System.out.println("Press E to place order");
		System.out.println("Press F for payment");
		System.out.println("Press G to reset password");
		System.out.println("Press H to enter the message");
		System.out.println("Press I to get response");
		System.out.println("Press J to logout");
		MedicalDAO mf = MedicineFactory.getInstance();
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		if (b.equals("A")) {
			MedicalBean m1 = mf.getAllMedicine();
			System.out.println(m1);
		} else if (b.equals("B")) {
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
//				}else {
//					System.out.println("Enter valid code..");
//				}
		} else if (b.equals("C")) {
			System.out.println("Enter userid");
			try {
			int userid = Integer.parseInt(sc.nextLine());
			CartBean m3 = mf.addMedicine(userid);
			}catch(Exception e) {
				System.out.println("Enter correct userid...");
			}
		} else if (b.equals("D")) {
			System.out.println("Enter name of medicine");
			String name = sc.nextLine();
			CartBean m4 = mf.removeMedicine(name);
		} else if (b.equals("E")) {
			System.out.println("Order placed...");
		} else if (b.equals("F")) {
			try {
			System.out.println("Enter the userid ");
			int id = Integer.parseInt(sc.nextLine());
			CartBean m4 = mf.payment(id);
			}catch(Exception e) {
				System.out.println("Id is not valid for payment..!!");
			}
		} else if (b.equals("G")) {
			try {
			System.out.println("Enter the userid ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the new password ");
			String pswd = sc.nextLine();
			UserRegistration m5 = mf.reset(id, pswd);
			System.out.println(m5);
			}catch(Exception e) {
				System.out.println("Userid is not proper..!!!");
			}
		} else if (b.equals("H")) {
			try {
			System.out.println("Enter userid - ");
			int userid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the message ");
			String usermessage = sc.nextLine();
			UserRequestBean m6 = mf.putMessage(userid, usermessage);
			System.out.println(m6);
			}catch(Exception e) {
				System.out.println("Userid is not proper..!!");
			}
		} else if (b.equals("I")) {
			try {
			System.out.println("Enter your id");
			int id = Integer.parseInt(sc.nextLine());
			AdminResponseBean m7 = mf.getResponse(id);
			System.out.println(m7);
			}catch(Exception e) {
				System.out.println("Userid is not proper..!!");
			}
		} else if (b.equals("J")) {
			System.out.println("Logged out");
		} else {
			System.out.println("Enter Correct Choice...");
		}
		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
		String p = sc.nextLine();
		if (p.equals("Yes")) {
			userLogin1();
		} else {
			System.out.println("THANK YOU..!!!");
		}
		sc.close();
	}

	public static void adminLogin() {
		System.out.println("Press 1 to see all medicine");
		System.out.println("Press 2 see details of a particular medicine");
		System.out.println("Press 3 to insert medicine");
		System.out.println("Press 4 to update medicine");
		System.out.println("Press 5 to delete medicine");
		System.out.println("Press 6 to delete user");
		System.out.println("Press 7 to recieve message");
		System.out.println("Press 8 to give response");
		System.out.println("Press 9 to logout");

		MedicalDAO mf = MedicineFactory.getInstance();
		Scanner sc = new Scanner(System.in);
		try {
			int button = Integer.parseInt(sc.nextLine());
			if (button == 1) {
				MedicalBean m1 = mf.getAllMedicine();
				System.out.println(m1);
			} else if (button == 2) {
				System.out.println("Enter the code of medicine which you want to see details - ");
				int code = Integer.parseInt(sc.nextLine());
				MedicalBean m2 = mf.getMedicine(code);
				if(m2!=null) {
				System.out.println(m2);
				}else {
					System.out.println("Enter valid code..");
				}
			} else if (button == 3) {
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
			} else if (button == 4) {
				System.out.println("Enter the code of medicine which you want to update - ");
				int code = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the new price of medicine - ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the updated quantity of medicine present in stock - ");
				int quantity = Integer.parseInt(sc.nextLine());
				MedicalBean m4 = mf.updateMedicine(code, price, quantity);
				System.out.println(m4);
			} else if (button == 5) {
				System.out.println("Enter the code of medicine which you want to delete - ");
				int code = Integer.parseInt(sc.nextLine());
				MedicalBean m5 = mf.deleteMedicine(code);
				System.out.println(m5);
			} else if (button == 6) {
				System.out.println("Enter the id of user which you want to delete - ");
				int userid = Integer.parseInt(sc.nextLine());
				UserRegistration m6 = mf.deleteUser(userid);
				System.out.println(m6);
			} else if (button == 7) {
				UserRequestBean m7 = mf.getMessage();
				System.out.println(m7);
			} else if (button == 8) {
				System.out.println("Enter id ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the response ");
				String response = sc.nextLine();
				AdminResponseBean m8 = mf.putResponse(response, id);
				System.out.println(m8);
			} else if (button == 9) {
				System.out.println("Logged Out...");
			}
		} catch (Exception e) {
			System.out.println("You have to enter the mention digits only..");
		}

		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
		String s = sc.nextLine();
		if (s.equals("Yes")) {
			adminLogin();
		} else {
			System.out.println("THANK YOU..!!!");
		}
		sc.close();
	}

}
