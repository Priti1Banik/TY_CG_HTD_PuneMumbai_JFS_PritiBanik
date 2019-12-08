package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {
public static void main(String[] args) {
	
	Connection conn = null;
	CallableStatement cstmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		System.out.println("*****");
		
		//get connection
		String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
		System.out.println("enter the user and password");
		String user = sc.nextLine();
		String password = sc.nextLine();
		conn = DriverManager.getConnection(dbUrl,user,password);
		System.out.println("connection established"); 
		System.out.println("*****");
		
		sc.close();
		
		//issue SQL query
		String query = "call getAllInfo";
		cstmt = conn.prepareCall(query);  //prepareCall() is used instead of prepareStatement()
		boolean b = cstmt.execute();
		
		if(b) {
			rs = cstmt.getResultSet();
			while(rs.next()) {
				System.out.println("userid: "+rs.getInt(1));
				System.out.println("username: "+rs.getString(2));
				System.out.println("email: "+rs.getString(3));
				System.out.println("password: "+rs.getString(4));
			}
			} else {
				int i = cstmt.getUpdateCount();
				if(i>0) {
					System.out.println("operation successful");
				}
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(conn!=null) { //for closing the connection
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(cstmt!=null) {  //for closing the statement
			try {
				cstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
		
	}
			if(rs!=null) {  //for closing the result set
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}		
		}
}
}
}

