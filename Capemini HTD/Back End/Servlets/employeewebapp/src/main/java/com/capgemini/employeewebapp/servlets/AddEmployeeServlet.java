package com.capgemini.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.employeewebapp.beans.EmployeeInfoBean;
import com.capgemini.employeewebapp.dao.EmployeeDAO;
import com.capgemini.employeewebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			//valid session
			//get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");
			String gender = req.getParameter("gender");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			long mobile = Long.parseLong(req.getParameter("mobile"));

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setGender(gender);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setMobile(mobile);
			
			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBean);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h2>Employee Record Added Successfully..</h2>");
			}else {
				out.println("<h2 style='color :red'>Unable to add Employee Record..</h2>");
			}
			out.println("<body>");
			out.println("<html>");
			
				
		}else {
			//invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html");
			out.println("<body>");
			out.println("<h2 style='color :red'>Please login first</h2>");
			out.println("<body>");
			out.println("</html>");
RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
dispatcher.include(req,resp);




		}

	}//end of doPost()



}//end of class
