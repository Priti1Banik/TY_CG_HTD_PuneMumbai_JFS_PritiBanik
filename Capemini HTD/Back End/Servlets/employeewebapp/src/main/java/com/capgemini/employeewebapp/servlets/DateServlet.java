package com.capgemini.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	
	public DateServlet() {
		System.out.println("It's the instantiation phase..");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("It's the intialization phase");
		//super.init();
	}//end of init

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("It's the service phase");
		
		Date date = new Date();
		
		resp.setHeader("refresh", "1");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
//		out.println("<head>");
//		out.println("<meta http-equiv='refresh' content='1'>");  //auto-reload after 1 second
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Current System Date and Time<br>");
		out.println(date + "</h1>");
		out.println("<html>");
		out.println("</body>");
		out.println("</html>");
		
	} //end of doGet()
	
	@Override
	public void destroy() {   //destroy method is called after closing of server
		System.out.println("It's the destroying phase.. ");
		//super.destroy();
	}
	
} //end of class
