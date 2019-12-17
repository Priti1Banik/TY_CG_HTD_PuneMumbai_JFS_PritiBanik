
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
<li><a href="./addProductForm">Add Product</a></li>
<li><a href="./updateProduct">Update Product</a></li>
<li><a href="./deleteProduct">Delete Product</a></li>
<li><a href="./getProductForm">Search Product</a></li>
<li><a href="./seeAllProduct">See All Product</a></li>
<li><a href="./deleteUser">Delete User</a></li>
<li><a href="./getMessage">User Message</a></li>
<li><a href="./putResponse">Put Response</a></li>
<li><a href="./logout">Logout</a></li>
</ul>

</body>
</html>