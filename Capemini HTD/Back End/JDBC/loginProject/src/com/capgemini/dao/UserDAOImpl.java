package com.capgemini.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import com.capgemini.bean.UserBean1;

public class UserDAOImpl implements UserDAO{

    FileReader reader = null;
	Properties prop = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	UserBean1 user = null;

	public UserDAOImpl() 
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
	public UserBean1 userLogin(int userid,String password) 
	{
		try(Connection conn = DriverManager.getConnection     //try with resource
				(prop.getProperty("dbUrl"),
						prop.getProperty("user"),
						prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query")))
		{
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			try(ResultSet rs = pstmt.executeQuery())
			{
				if(rs.next()) 
				{
					user = new UserBean1();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}


		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return null;
	}
}


