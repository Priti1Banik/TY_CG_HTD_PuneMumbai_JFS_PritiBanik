package com.capgemini.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigParamServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		String empNameVal = config.getInitParameter("empName");
		
		//context param can be accessed for all servlet whereas init param is for one particular servlet
		ServletContext context = getServletContext(); //ServletContext context = req.getServletContext(); -->same meaning
		String companyNameVal = context.getInitParameter("companyName");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Config Param Value is " + empNameVal + "<h2>");
		out.println("<h2>Config Context Value is " + companyNameVal + "<h2>");
		out.println("</body>");
		out.println("</html>");
	}//end of doGet 
}//end of class

