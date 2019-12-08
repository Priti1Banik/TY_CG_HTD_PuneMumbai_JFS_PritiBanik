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

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empIdVal = Integer.parseInt(req.getParameter("empId"));
	String password = req.getParameter("pwd");
	
	EmployeeDAO dao = new EmployeeDAOJpaImpl();
	EmployeeInfoBean employeeInfoBean = dao.authenticate(empIdVal, password);
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	RequestDispatcher dispatcher = null;
	if(employeeInfoBean != null) {
		//RequestDispatcher dispatcher = req.getRequestDispatcher("./homePage.html");
		HttpSession session = req.getSession(true);
		session.setMaxInactiveInterval(60);//this will end session after 60 sec
		session.setAttribute("empInfo", employeeInfoBean);
		out.println("<h2>Hello "+employeeInfoBean.getEmpName() + "</h2>");
		dispatcher = req.getRequestDispatcher("./homePage.html");
		//dispatcher.include(req, resp);
	} else {
		out.println("<h2 style='color: red'>Invalid Credentials</h2>");
		//RequestDispatcher dispatcher = req.getRequestDispatcher("./loginFailed.html");
		dispatcher = req.getRequestDispatcher("./loginForm.html");
		//dispatcher.include(req, resp);
	}
	dispatcher.include(req, resp);
	
	out.println("</body>");
	out.println("</html>");
	}//end of do post
}//end of class
