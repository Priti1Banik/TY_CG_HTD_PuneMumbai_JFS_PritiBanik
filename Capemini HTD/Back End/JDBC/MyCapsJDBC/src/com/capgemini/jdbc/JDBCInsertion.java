package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class JDBCInsertion {
public static void main(String[] args) {
	
	Connection conn = null;
	Statement stmt = null;
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
		String query = "INSERT INTO Users_Info VALUES(2019006,'snehal','12@gmail.com','sqrt')";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(query); 
		
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
		if(stmt!=null) {  //for closing the statement
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
		
	}
}
}
}
}

