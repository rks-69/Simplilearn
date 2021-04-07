<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Howdy, User!</title>
<style>
body {
	background-color: powderblue;
}

.btn {
	margin-left: auto;
	margin-right: auto;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	margin-left: auto;
	margin-right: auto;
}

h1, h2 {
	text-align: center;
}

.text-center {
	text-align: center;
}
</style>
</head>
<body>
	<br />
	<br />
	<h1>Welcome to the User Dashboard</h1>
	<br />
	<br />
	<h2>Listing All the Products</h2>
	<br />
	<br />
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Brand</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach var="tempProduct" items="${product}">
			<tr>
				<td>${tempProduct.id}</td>
				<td>${tempProduct.name}</td>
				<td>${tempProduct.description}</td>
				<td>${tempProduct.brand}</td>
				<td>${tempProduct.category}</td>
				<td>${tempProduct.price}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>