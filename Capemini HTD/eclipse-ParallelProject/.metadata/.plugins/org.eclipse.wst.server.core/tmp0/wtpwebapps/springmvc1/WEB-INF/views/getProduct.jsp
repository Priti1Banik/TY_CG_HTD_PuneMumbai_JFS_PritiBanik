<%@page import="com.capgemini.springmvc.beans.MedicineInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%	MedicineInfoBean medicineInfoBean = (MedicineInfoBean) request.getAttribute("medicineInfoBean");
     String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./getProduct" method="get">
			<table border="1">
				<tr>
					<td>Enter Code</td>
					<td> : </td>
					<td><input type="number" name="code" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br>
						<input type="submit" value="search">
					</td>
				</tr>
			</table>
		</form>
	
	<br>
	<% if (medicineInfoBean != null) { %>
		<h3 style="color: green;">Product Code <%=medicineInfoBean.getCode()%> Found...</h3>
		<table border="1">
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Category</th>
			</tr>
			<tr>
				<td><%=medicineInfoBean.getCode()%></td>
				<td><%=medicineInfoBean.getName()%></td>
				<td><%=medicineInfoBean.getPrice()%></td>
				<td><%=medicineInfoBean.getQuantity()%></td>
				<td><%=medicineInfoBean.getCategory() %></td>
			</tr>
		</table>
		<% } %>
	<% if (msg != null && !msg.isEmpty()) { %>
		<h3 style="color: red;"><%=msg%></h3>
	<% } %>

</body>
</html>