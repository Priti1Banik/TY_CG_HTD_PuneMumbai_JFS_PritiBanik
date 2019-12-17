<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false" %>
    <%String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(msg!=null && !msg.isEmpty()){ %>
<h3><%=msg %></h3>
<%} %>

<fieldset>
		<legend>Add Product</legend>
		<form action="./addProduct" method="post">
		<table>
			<tr>
				<td>Code</td>
				<td>:</td>
				<td><input type="number" name="code" required></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Price</td>
				<td>:</td>
				<td><input type="number" name="price" required></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td>:</td>
				<td><input type="number" name="quantity" required></td>
			</tr>
			<tr>
				<td>Category</td>
				<td>:</td>
				<td><input type="text" name="category" required></td>
			</tr>
			<tr>
				<td colspan="3" align center><br> <input type="submit"
					value="Add Product"></td>
			</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>