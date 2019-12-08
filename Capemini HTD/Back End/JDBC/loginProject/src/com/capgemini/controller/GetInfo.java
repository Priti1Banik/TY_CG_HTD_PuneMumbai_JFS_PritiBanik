package com.capgemini.controller;

import java.util.List;

import com.capgemini.bean.UserBean1;
import com.capgemini.dao.UserDAO1;
import com.capgemini.factory.UserFactory1;
public class GetInfo {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		UserDAO1 dao = UserFactory1.getInstance();
		
		/*System.out.println("enter user id: ");
		int userid = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter user password");
		String password = sc.nextLine();
		UserBean1 user = dao.userLogin(userid, password);
*/		
		List<UserBean1>userList = dao.getAllInfo();
		if(userList != null) 
		{
			for(UserBean1 user:userList) 
			{
				System.out.println(user);
			}
		}
		else {
			System.out.println("something went wrong");
		}
		//sc.close();
	}
	}

