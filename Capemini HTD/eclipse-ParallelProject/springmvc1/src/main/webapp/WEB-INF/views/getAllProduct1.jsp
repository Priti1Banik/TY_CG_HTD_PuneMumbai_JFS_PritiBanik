<%@page import="com.capgemini.springmvc.beans.MedicineInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false" %>
    <%	List <MedicineInfoBean> productList = (List<MedicineInfoBean>) request.getAttribute("productList"); %><
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./seeAllProduct1">See All Product</a>
	<br><br>
	<% if (productList != null && !productList.isEmpty()) { %>
	<div align="center">
		<table>
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Category</th>
			</tr>
			<% for (MedicineInfoBean medicineInfoBean : productList) { %>
				<tr>
					<td><%=medicineInfoBean.getCode()%></td>
					<td><%=medicineInfoBean.getName()%></td>
					<td><%=medicineInfoBean.getPrice()%></td>
					<td><%=medicineInfoBean.getQuantity()%></td>
					<td><%=medicineInfoBean.getCategory() %></td>
				</tr>
			<% } %>	
		</table>
	</div>
	<% } else { %>
		<h3 style="color: red;">Unable To Fetch Records!!!</h3>
	<% } %>
</body>
</html>