package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCRetrival {
public static void main(String[] args) {
	
	FileReader reader = null;
	Properties prop = null;
	ResultSet rs = null;
	try {
		//load the driver
		 reader = new FileReader("db.properties");
		prop = new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driverClass"));
		System.out.println("driver class loaded");
		System.out.println("*******************");
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
try(Connection conn = DriverManager.getConnection
                      (prop.getProperty("dbUrl"),prop.getProperty("user"),
                    		  prop.getProperty("password")))  //try with resource
{
	Statement stmt = conn.createStatement();
	rs = stmt.executeQuery(prop.getProperty("query"));
	
	//process the result
	while(rs.next()) {
		System.out.println("User Id: "+rs.getInt(1));
		System.out.println("User Name: "+rs.getString(2));
		System.out.println("email: "+rs.getString(3));
		System.out.println ("***********************");
	}
	
}
catch(Exception e) 
{
e.printStackTrace();	
}


}
}
