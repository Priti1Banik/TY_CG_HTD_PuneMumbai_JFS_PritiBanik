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
		<legend>Put Response</legend>
		<form action="./putResponse1" method="post">
		<table>
			<tr>
				<td>Id</td>
				<td>:</td>
				<td><input type="number" name="id" required></td>
			</tr>
			<tr>
				<td>Response</td>
				<td>:</td>
				<td><input type="text" name="response" required></td>
			</tr>
			<tr>
				<td colspan="3" align center><br> <input type="submit"
					value="Add Response"></td>
			</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>