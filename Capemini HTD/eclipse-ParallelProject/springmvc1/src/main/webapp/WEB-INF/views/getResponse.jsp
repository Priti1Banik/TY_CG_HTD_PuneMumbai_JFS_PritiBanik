<%@page import="com.capgemini.springmvc.beans.AdminResponseBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%	AdminResponseBean adminResponseBean = (AdminResponseBean) request.getAttribute("adminResponseBean");
     String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./getResponse1" method="get">
			<table border="1">
				<tr>
					<td>Enter your Id</td>
					<td> : </td>
					<td><input type="number" name="id" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br>
						<input type="submit" value="search">
					</td>
				</tr>
			</table>
		</form>
	
	<br>
	<% if (adminResponseBean != null) { %>
		<h3 style="color: green;">Product Code <%=adminResponseBean.getId()%> Found...</h3>
		<table border="1">
			<tr>
				<th>Response</th>
				
			</tr>
			<tr>
				<td><%=adminResponseBean.getId()%></td>
				<td><%=adminResponseBean.getResponse()%></td>
			</tr>
		</table>
		<% } %>
	<% if (msg != null && !msg.isEmpty()) { %>
		<h3 style="color: red;"><%=msg%></h3>
	<% } %>

</body>
</html>