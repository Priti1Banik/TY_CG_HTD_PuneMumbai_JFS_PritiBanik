<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page session="false" %>
    <%String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}
</style>
</head>
<body>
<ul>
  <li><a href="./homepage">Home</a></li>
   <li><a href="./about">About us</a></li>
  <li><a href="./userRegistration">Sign Up New User</a></li>
  <li><a href="./loginForm">Login</a></li>
</ul>
	<fieldset>
		<legend>User Login</legend>
		<!-- <form action="./login" method="post"> -->
		<!-- <form action="./login2" method="post"> -->
		<!-- <form action="./login3" method="post"> -->
		<form action="./adminLogin" method="post">
			<table>
				<tr>
					<td>username</td>
					<td>:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						name="login"></td>
				</tr>
			</table>
		</form>
</body>
</html>