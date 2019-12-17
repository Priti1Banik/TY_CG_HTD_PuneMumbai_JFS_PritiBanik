<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%	String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./payment1" method="get">
			<table border="1">
				<tr>
					<td>Enter User Id</td>
					<td> : </td>
					<td><input type="number" name="uid" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br>
						<input type="submit" value="Pay Bill">
					</td>
				</tr>
			</table>
		</form>
	
	<br>
	<% if (msg != null && !msg.isEmpty()) { %>
		<h3 style="color: red;">${msg}</h3>
	<% } %>
</body>
</html>