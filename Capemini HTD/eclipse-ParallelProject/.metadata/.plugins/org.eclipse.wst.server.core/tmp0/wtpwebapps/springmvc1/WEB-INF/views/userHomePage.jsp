<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<li><a href="./seeAllProduct1">See All Product</a></li>
<li><a href="./getProductUser">Search Product</a></li>
<li><a href="./addMedicine">Add to cart</a></li>
<li><a href="./deleteMedicine">Delete from cart</a></li>
<li><a href="./payment">Payment</a></li>
<li><a href="./updateUserForm">Update Profile</a></li>
<li><a href="./putMessage">Put Message</a></li>
<li><a href="./getResponse">Admin Response</a></li>
<li><a href="./logout1">Logout</a></li>
</ul>

</body>
</html>