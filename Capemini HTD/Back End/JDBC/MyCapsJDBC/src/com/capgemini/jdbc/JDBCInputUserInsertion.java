package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.Connection;

public class JDBCInputUserInsertion {
public static void main(String[] args) {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Scanner sc= new Scanner(System.in);
	try {
		// load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		System.out.println("*****");
		
		//get the connection
		String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=tiger";
		conn = DriverManager.getConnection(dbUrl);
		System.out.println("connecttion established");
		System.out.println("*****");
		
		//Issue SQL query via connection
		String query = "INSERT INTO Users_Info VALUES(?,?,?,?)"; //dynamic query
		pstmt = conn.prepareStatement(query);
		System.out.println("enter userid...");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter username...");
		pstmt.setString(2, sc.nextLine());
		System.out.println("enter email...");
		pstmt.setString(3, sc.nextLine());
		System.out.println("enter password...");
		pstmt.setString(4, sc.nextLine());
		
		sc.close();
		
		int count = pstmt.executeUpdate();
		
		//process the results
		if(count>0) {
			System.out.println("data inserted");
		}
		
	} 
	catch (Exception e) { // this will accepts multiple catch blocks
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
		if(pstmt!=null) {  //for closing the statement
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
		
	}
}
}
}
}
