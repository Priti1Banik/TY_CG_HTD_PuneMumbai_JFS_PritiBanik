package com.capgemini.corejava.regex;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.Connection;
public class JDBCRegexValidation {

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
			
			String user = sc.nextLine();
			Pattern pattern = Pattern.compile("\\d{7}");
			
			Matcher matcher = pattern.matcher(user);
			if(matcher.matches()==true) {
				pstmt.setInt(1, Integer.parseInt(user));
			}
			else {
				System.out.println("incorrect user");
			}
			
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


