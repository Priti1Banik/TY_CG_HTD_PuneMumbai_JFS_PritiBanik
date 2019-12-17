package com.capgemini.medical.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.capgemini.medical.bean.AdminResponseBean;
import com.capgemini.medical.bean.CartBean;
import com.capgemini.medical.bean.MedicalBean;
import com.capgemini.medical.bean.UserRegistration;
import com.capgemini.medical.bean.UserRequestBean;


public class MedicalDAOImpl implements MedicalDAO{

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	@Override
	public MedicalBean getAllMedicine() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select * from product";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Code is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Price is "+rs.getDouble(3));
				System.out.println("Quantity is "+rs.getInt(4));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public MedicalBean getMedicine(int code) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select * from product where code=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,code);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("Code is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Price is "+rs.getDouble(3));
				System.out.println("Quantity is "+rs.getInt(4));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public MedicalBean insertMedicine(int code, String name, double price, int quantity,String category) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "insert into product values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,code);
			pstmt.setString(2,name);
			pstmt.setDouble(3,price);
			pstmt.setInt(4,quantity);
			pstmt.setString(5,category);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("medicine registered");
			}
			else {
				System.out.println("You cannot register for this code..");
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}

		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	@Override
	public MedicalBean updateMedicine(int code,double price,int quantity) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "update  product set price=?, quantity=? where code=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setDouble(1, price);
			pstmt.setInt(2,quantity);
			pstmt.setInt(3,code);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("medicine updated");
			}
			else {
				System.out.println("Update is not possible for this code...");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	@Override
	public MedicalBean deleteMedicine(int code) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "delete from product where code=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, code);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("medicine deleted");
			}
			else {
				System.out.println("Medicine not available for deletion..");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public UserRegistration deleteUser(int userid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "delete from user_registration where userid=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userid);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("User deleted");
			}
			else {
				System.out.println("Id not exist...");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean checkAdminUserLogin(String username, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select id from admin_login where username=? and password=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				System.out.println("Logged in");
				return true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public UserRegistration registerUser(int userid, String username, String password, int mobile) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "insert into user_registration values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,userid);
			pstmt.setString(2,username);
			pstmt.setString(3,password);
			pstmt.setInt(4,mobile);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("user registered");
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean userLogin(String username, String password) {
		int userid = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select userid from user_registration where username=? and password=?";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				
				System.out.println("User id = "+rs.getInt(1));
				userid=rs.getInt(1);
				System.out.println("Logged in");
				return true;
			} else {
				return false;
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public MedicalBean getMedicine(String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select * from product where name=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("Code is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Price is "+rs.getDouble(3));
				System.out.println("Quantity is "+rs.getInt(4));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public CartBean addMedicine(int userid) {
		String username=null;
		String pname=null;
		double price=0;
		int pid=0;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select username from user_registration where userid=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("username" +rs.getString(1));
				System.out.println("id" +userid);
				System.out.println("enter the product name ");
				pname=sc.nextLine();
				String query2 = "select code,price from product where name=?";
				pstmt = conn.prepareStatement(query2);
				pstmt.setString(1,pname);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					System.out.println("pid" +rs.getInt(1));
					System.out.println("price" +rs.getDouble(2));
					pid=rs.getInt(1);
					price=rs.getDouble(2);
				}
				String query3 = "insert into cart(uid,pname,price,pid) values(?,?,?,?)";	
				pstmt = conn.prepareStatement(query3);
				pstmt.setInt(1,userid);
				//pstmt.setString(2,username);
				pstmt.setString(2,pname);
				pstmt.setDouble(3,price);
				pstmt.setInt(4,pid);
				System.out.println("..................");
				int count=pstmt.executeUpdate();
				if(count>0) {
					System.out.println("product added to cart");
				}
				else {
					System.out.println("Enter valid user id...");
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public CartBean removeMedicine(String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "delete from cart where pname=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("medicine remove from cart");
			}
			else {
		System.out.println("Enter proper name..");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public CartBean payment(int userid) {
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select sum(price) from cart where uid=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Total price = " +rs.getDouble(1));
			} 
			else {
				System.out.println("Enter proper id..");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public UserRegistration reset(int userid, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "update user_registration set password=? where userid=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, password);
			pstmt.setInt(2,userid);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("user updated");
			}
			else {
				System.out.println("enter valid user id..");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public UserRequestBean putMessage(int userid, String usermessage) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "insert into user_request values(?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,userid);
			pstmt.setString(2,usermessage);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("Message recieved");
			}
			else {
				System.out.println("Enter proper id ...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}

		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public AdminResponseBean putResponse(String response, int id) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);

			String query = "insert into admin_response(response,id) values(?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,response);
			pstmt.setInt(2,id);
			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("Response send");
			}
			else {
				System.out.println("Id not not applicable for response..");
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}

		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public UserRequestBean getMessage() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select * from user_request";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if(rs.next()) {
				System.out.println("Code is "+rs.getInt(1));
				System.out.println("Message is "+rs.getString(2));
			}
			else {
				System.out.println("Message not available..");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public AdminResponseBean getResponse(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			String dburl = "jdbc:mysql://localhost:3306/cg_parallelproject_db?user=root&password=tiger";
			conn = DriverManager.getConnection(dburl);
			String query = "select response from admin_response where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Response is "+rs.getString(1));
			} 
			else {
				System.out.println("Response not available for this id...");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
