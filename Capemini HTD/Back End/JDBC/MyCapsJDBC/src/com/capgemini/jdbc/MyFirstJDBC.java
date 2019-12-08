package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;

public class MyFirstJDBC {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null; //resultSet help to get the result table
	try {
	//load driver
		java.sql.Driver driver= new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);
	System.out.println("driver loaded");
	System.out.println("*****");
	
	//get the database connection via driver
	String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=tiger";
	conn = DriverManager.getConnection(dbUrl);
	System.out.println("connecttion established");
	System.out.println("*****");
	
	//issue SQL Query via connection
	String query = "SELECT * FROM Users_Info";
	stmt = conn.createStatement(); //create string into (SQL) statement
	rs = stmt.executeQuery(query);
	
	//process the results returned by SQL query
	while(rs.next()) { //next() will move the cursor from starting of the block and continue till false condition is achieved
		System.out.println("User Id: "+rs.getInt("userid"));
		System.out.println("User name: "+rs.getString("username")); //if we know proper order of column then we can use 1,2,3,... like this
		System.out.println("email: "+rs.getString("email"));
		System.out.println("Password: "+rs.getString("password"));
		System.out.println("*******");
	}
		
}
	catch(SQLException e) {
		e.printStackTrace();  //show inbuilt message
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
		if(stmt!=null) {  //for closing the statement
			try {
				stmt.close();
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
