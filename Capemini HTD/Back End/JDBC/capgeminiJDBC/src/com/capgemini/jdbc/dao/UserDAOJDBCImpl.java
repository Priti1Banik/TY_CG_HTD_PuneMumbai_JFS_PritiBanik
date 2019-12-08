package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOJDBCImpl implements UserDAO{

	FileReader reader = null;
	Properties prop = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	UserBean user = null;

	public UserDAOJDBCImpl() {
		try {
			//load the driver
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));


		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserBean getInfo(int userid) {
		try(Connection conn = DriverManager.getConnection
				(prop.getProperty("dbUrl"),
						prop.getProperty("user"),
						prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))){
			pstmt.setInt(1, userid);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					user = new UserBean();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}catch(Exception e) {
				e.printStackTrace();
			}


		}catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
