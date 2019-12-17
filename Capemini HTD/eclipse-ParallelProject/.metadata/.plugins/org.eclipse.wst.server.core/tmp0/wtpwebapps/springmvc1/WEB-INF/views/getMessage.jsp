<%@page import="com.capgemini.springmvc.beans.UserRequestBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%	List <UserRequestBean> messageList = (List<UserRequestBean>) request.getAttribute("messageList"); %><
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./getMessage">See Messages</a>
	<br><br>
	<% if (messageList != null && !messageList.isEmpty()) { %>
	<div align="center">
		<table>
			<tr>
				<th>User Id</th>
				<th>User Message</th>
				
			</tr>
			<% for (UserRequestBean userRequestBean : messageList) { %>
				<tr>
					<td><%=userRequestBean.getUserid()%></td>
					<td><%=userRequestBean.getUsermessage()%></td>
				
				</tr>
			<% } %>	
		</table>
	</div>
	<% } else { %>
		<h3 style="color: red;">Unable To Fetch Records!!!</h3>
	<% } %>
</body>
</html>