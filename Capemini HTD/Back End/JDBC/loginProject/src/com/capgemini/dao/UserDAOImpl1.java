//for list of user

package com.capgemini.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.capgemini.bean.UserBean1;

public class UserDAOImpl1 implements UserDAO1{

    FileReader reader = null;
	Properties prop = null;
	ResultSet rs = null;
	Statement stmt = null;
	UserBean1 user = null;

	public UserDAOImpl1() 
	{
		try 
		{
			//load the driver
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
            System.out.println("driver loaded");

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean1> getAllInfo() 
	{
		List<UserBean1> userList = new ArrayList<UserBean1>();
		try(Connection conn = DriverManager.getConnection     //try with resource
				(prop.getProperty("dbUrl"),
						prop.getProperty("user"),
						prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query3")))
		{
		
			
				while(rs.next()) 
				{
					user = new UserBean1();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
					userList.add(user);
				}
				return userList;
			}
		
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return null;
	}
}

