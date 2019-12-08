package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBDRetrievalAll {

	public static void main(String[] args) {
		Connection conn = null;
		FileReader reader = null;
		Properties prop = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		Scanner sc = new Scanner(System.in);

		try 
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			System.out.println("*****");

			reader = new FileReader("db.properties");  //url present in db.properties
			prop = new Properties();
			prop.load(reader);       //load method is extract properties file
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}


		try 
		{
			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			//String dbUrl = prop.getProperty("dbUrl1");  ->this will make use of properties file which sources multiple UR or databases
			conn = DriverManager.getConnection(dbUrl, prop);
			//	conn = DriverManager.getConnection(dbUrl,prop.getProperty("User"),prop.getProperty("password"));
			System.out.println("connecttion established");
			System.out.println("*****");

			//issue the SQL query
			String query = "SELECT * FROM Users_Info WHERE userid= ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter the value: ");
			pstmt.setInt(1, sc.nextInt());
			sc.close();
			rs = pstmt.executeQuery();

			if(rs.next()) 
			{
				System.out.println("User Id: "+rs.getInt(1));
				System.out.println("User Name: "+rs.getString(2));
				System.out.println("email: "+rs.getString(3));
				System.out.println ("Password: "+rs.getString(4));

			}
			else
			{
				System.out.println("user not available");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}	
		//closing of object
		finally 
		{
			if(conn!=null){ //for closing the connection
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




