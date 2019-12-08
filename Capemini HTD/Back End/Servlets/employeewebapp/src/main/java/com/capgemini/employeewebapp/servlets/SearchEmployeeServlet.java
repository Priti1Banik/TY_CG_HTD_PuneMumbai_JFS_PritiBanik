package com.capgemini.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeewebapp.beans.EmployeeInfoBean;
import com.capgemini.employeewebapp.dao.EmployeeDAO;
import com.capgemini.employeewebapp.dao.EmployeeDAOJpaImpl;
@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get the from data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		EmployeeInfoBean employeeInfoBean = dao.getEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		if(employeeInfoBean != null) {
			//display employee record
			out.println("<h2>Employee Id " + empId + "Found<h2>");
			out.println("Employee Name = " +employeeInfoBean.getEmpName());
			out.println("<br>Age = " +employeeInfoBean.getAge());
			out.println("<br>Mobile = " +employeeInfoBean.getMobile());
			out.println("<br>Gender = " +employeeInfoBean.getGender());
			out.println("<br>Salary = " +employeeInfoBean.getSalary());
			out.println("<br>Designation = " +employeeInfoBean.getDesignation());
			out.println("<br>Password = " +employeeInfoBean.getPassword());
		} else {
			//display error message
			out.println("<h3 style='color :red'>Employee Id" + empId +" Not Found!!!");
		} 
		
		out.println("</body>");
		out.println("</html>");
	}//end of doGet
}//end of class
