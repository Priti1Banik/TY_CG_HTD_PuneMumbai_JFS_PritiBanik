package com.capgemini.medicalcollection.functionality;

import java.util.Scanner;

import com.capgemini.medicalcollection.beans.MedicineBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class MedicalFunctionality {
	public static void main(String[] args) {
		System.out.println("Welcome to Online Medical Store...!!!!");
		medicalStore();
	}
	public static void medicalStore() {
		System.out.println("Press A for admin ");
		System.out.println("Press B for User Registration");
		System.out.println("Press C for User Login");
		Scanner sc = new Scanner(System.in);
			char button = sc.next().charAt(0);
			if (button == 'A') {
				MedicineDAO mf = MedicineFactory.getInstance();

				boolean al = mf.adminLogin();
				if (al == true) {
					adminAccess();
				} else {
					System.out.println("Enter correct credentials..");
					medicalStore();
				}
			} else if (button == 'B') {
				MedicineDAO mf = MedicineFactory.getInstance();
				mf.userRegister();
			} else if (button == 'C') {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter username---");
				String username = sc1.nextLine();
				System.out.println("Enter password---");
				String password = sc1.nextLine();
				MedicineDAO mf = MedicineFactory.getInstance();
				boolean al1 = mf.userLogin(username, password);
				if (al1 == true) {
					userAccess();
				} else {
					System.out.println("Enter correct credentials..");
					medicalStore();
				}
			} else {
				System.out.println("Enter valid option..");
				medicalStore();
			}
	}

	public static void userAccess() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Press 1 to see all products");
		System.out.println("Press 2 to see a particular products");
		System.out.println("Press 3 to add product to cart");
		System.out.println("Press 4 to show items of cart");
		System.out.println("Press 5 to delete product from cart");
		System.out.println("Press 6 to confirm order");
		System.out.println("Press 7 for bill generation");
		System.out.println("Press 8 to make payement");
		System.out.println("Press 9 to update account");
		System.out.println("Press 10 to send message");
		System.out.println("Press 11 to recieve response");
		System.out.println("Press 12 to show updated account");
		System.out.println("Press 13 to logout");
		//Scanner sc = new Scanner(System.in);
		MedicineDAO mf = MedicineFactory.getInstance();
		int button = Integer.parseInt(sc.nextLine());
		if (button == 1) {
			mf.getAllProduct();
		} else if (button == 2) {
			try {
			System.out.println("Enter the code of medicine");
			int code = Integer.parseInt(sc.nextLine());
			mf.getProduct(code);
			}catch(Exception e) {
				System.out.println("Enter proper code..!!");
			}
		} else if (button == 3) {
			mf.addToCart();
		} else if (button == 4) {
			try {
			System.out.println("Enter user id");
			int uid = Integer.parseInt(sc.nextLine());
			mf.showItemAddedToCart(uid);
			}catch(Exception e) {
				System.out.println("Enter correct user id..!!!");
			}
		} else if (button == 5) {
			mf.deleteFromCart();
		} else if (button == 6) {
			try {
			System.out.println("Enter userid---");
			int userid = Integer.parseInt(sc.nextLine());
			mf.orderFromCart(userid);
			}catch(Exception e) {
				System.out.println("Enter proper userid..!!");
			}
		} else if (button == 7) {
			try {
			System.out.println("Enter userid---");
			int userid = Integer.parseInt(sc.nextLine());
			mf.billGeneration(userid);
			}catch(Exception e) {
				System.out.println("Enter proper userid..!!");
			}
		} else if (button == 8) {
			System.out.println("Press A to make payment");
			System.out.println("Press B to cancel order");
			String b = sc.nextLine();
			if (b.equals("A")) {
				System.out.println("Payment made successfully...!!!!!!");
			} else if (b.equals("B")) {
				System.out.println("Payment is not made successfully..Try to buy later");
			}
		} else if (button == 9) {
			try {
			System.out.println("Enter user id");
			int userid = Integer.parseInt(sc.nextLine());
			System.out.println("Enter new username");
			String username = sc.nextLine();
			System.out.println("Enter new password");
			String password = sc.nextLine();
			System.out.println("Enter new mobile number");
			String mobile = sc.nextLine();
			boolean m = mf.updateUser(userid, username, password, mobile);
			System.out.println(m);
			}catch(Exception e) {
				System.out.println("Enter proper details..!!!");
			}
		} else if (button == 10) {
			mf.addMessage();
		} else if (button == 11) {
			try {
			System.out.println("Enter your Id---");
			int id = Integer.parseInt(sc.nextLine());
			mf.getResponse(id);
			}catch(Exception e) {
				System.out.println("Enter proper id..!!");
			}
		} else if (button == 12) {
			try {
			System.out.println("Enter userid--");
			int userid = Integer.parseInt(sc.nextLine());
			mf.getUpdatedUser(userid);
			}catch(Exception e) {
				System.out.println("Enter correct userid..!!");
			}
		} else if (button == 13) {
			System.out.println("Logged Out..!!");
		}
		}catch(Exception e) {
			System.out.println("Choose the correct option..!!!");
		}
		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
		String s = sc.nextLine();
		if (s.equals("Yes")) {
			userAccess();
		} else {
			System.out.println("THANK YOU...");
		}
		sc.close();
	}

	public static void adminAccess() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Press 1 to see all medicines");
		System.out.println("Press 2 to add medicine");
		System.out.println("Press 3 to remove medicine");
		System.out.println("Press 4 to update");
		System.out.println("Press 5 to get a particular product");
		System.out.println("Press 6 to see all user");
		System.out.println("Press 7 to delete user");
		System.out.println("Press 8 to recieve message");
		System.out.println("Press 9 to send response");
		System.out.println("Press 10 to logout");
	//	Scanner sc = new Scanner(System.in);
		int button = Integer.parseInt(sc.nextLine());
		MedicineDAO mf = MedicineFactory.getInstance();
		if (button == 1) {
			mf.getAllProduct();
		} else if (button == 2) {
			mf.addProduct();
		} else if (button == 3) {
			mf.removeProduct();
		} else if (button == 4) {
			try {
			System.out.println("Enter the code whose price you want to update");
			int code = Integer.parseInt(sc.nextLine());
			System.out.println("Enter new price");
			double price = Double.parseDouble(sc.nextLine());
			System.out.println("Enter new Price to Update");
			int quantity = Integer.parseInt(sc.nextLine());
			boolean m = mf.updateProduct(code, price, quantity);
			System.out.println(m);
			}catch(Exception e) {
				System.out.println("Enter proper data..!!");
			}
		} else if (button == 5) {
			try {
			System.out.println("Enter the code of medicine");
			int code = Integer.parseInt(sc.nextLine());
			mf.getProduct(code);
			}catch(Exception e) {
				System.out.println("Enter proper medicine code..!!");
			}
		} else if (button == 6) {
			mf.showAllUser();
		} else if (button == 7) {
			mf.deleteUser();
		} else if (button == 8) {
			mf.getAllMessage();
		} else if (button == 9) {
			mf.putResponse();
		} else if (button == 10) {
			System.out.println("Logged Out..!!!");
		}
		}catch(Exception e){
		System.out.println("Choose the correct choice..!!");	
		}
		System.out.println("Do you want to proceed ?");
		System.out.println("Yes Or No");
		String s = sc.nextLine();
		if (s.equals("Yes")) {
			adminAccess();
		} else {
			System.out.println("THANK YOU...");
		}
		sc.close();
	}
}
