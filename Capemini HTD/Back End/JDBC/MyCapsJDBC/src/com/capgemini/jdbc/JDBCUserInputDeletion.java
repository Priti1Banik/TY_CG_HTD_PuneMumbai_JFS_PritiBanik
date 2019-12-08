package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class JDBCUserInputDeletion {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("*****");
			
			//get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			System.out.println("*****");
			
			//Issue SQL query via connection
			String query = "DELETE FROM Users_Info WHERE userid = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter userid...");
			pstmt.setInt(1, sc.nextInt());
			sc.close();
			
			int count = pstmt.executeUpdate(); 
			
			//process the results
			if(count>0) {
				System.out.println("data deleted");
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


			




