package com.capgemini.controller;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.capgemini.bean.UserBean1;
import com.capgemini.dao.UserDAO;
import com.capgemini.factory.UserFactory;

public class UserLogin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		
		System.out.println("enter user id: ");
		int userid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter user password");
		String password = sc.nextLine();
		UserBean1 user = dao.userLogin(userid, password);
		
		if(user!= null) {
			System.out.println(user);
		}
		else {
			System.out.println("something went wrong");
		}
		sc.close();
	}
	}


