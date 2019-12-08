package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class JDBCRetrival {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		Scanner sc = new Scanner(System.in);
		
		try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		System.out.println("*****");
		
		//get the database connection via driver
		String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=tiger";
		conn = DriverManager.getConnection(dbUrl);
		System.out.println("connecttion established");
		System.out.println("*****");
		
		//issue the SQL query
		String query = "SELECT * FROM Users_Info WHERE userid= ?";
		pstmt = conn.prepareStatement(query);
		System.out.println("enter the value: ");
			pstmt.setInt(1, sc.nextInt());
			sc.close();
		rs = pstmt.executeQuery();
		
		//process the results
		if(rs.next()) {
			System.out.println("User Id: "+rs.getInt(1));
			System.out.println("User Name: "+rs.getString(2));
			System.out.println("email: "+rs.getString(3));
			System.out.println ("Password: "+rs.getString(4));
			
		}
		else {
			System.out.println("user not available");
		}
		}
		
		catch(Exception e) {
          e.printStackTrace();			
		}
		//closing of object
		finally {
			if(conn!=null) { //for closing the connection
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {  //for closing the prepare statement
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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

	

