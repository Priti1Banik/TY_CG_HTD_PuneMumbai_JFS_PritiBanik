package com.capgemini.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//this will make non-persistence cookies
		Cookie cookie = new Cookie("empId","123");
		//this will make persistence cookies
		cookie.setMaxAge(7*24*60*60);
		resp.addCookie(cookie);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Cookie created successfully");
		out.println("</body>");
		out.println("</html>");
	}
}
