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
		<legend>Update User</legend>
		<form action="./updateUser" method="post">
		<table>
			<tr>
				<td>Userid</td>
				<td>:</td>
				<td><input type="number" name="userid" required></td>
			</tr>
			<tr>
				<td>Username</td>
				<td>:</td>
				<td><input type="text" name="username" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="text" name="password" required></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td>:</td>
				<td><input type="number" name="mobile" required></td>
			</tr>
			<tr>
				<td colspan="3" align center><br> <input type="submit"
					value="Update User"></td>
			</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>