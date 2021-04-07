<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Lists</title>
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
	<h1>Welcome to the Admin Dashboard</h1>
	<br />
	<br />
	<div class="text-center">
		<a href="/admin/addProduct"> <input type="submit"
			value="Add New Product" />
		</a>
	</div>
	<br />
	<div class="text-center">
		<a href="/admin/userslist"> <input type="submit"
			value="See All Users">
		</a>
	</div>
	<br />
	<div class="text-center">
		<a href="/admin/reports"> <input type="submit" value="See Reports">
		</a>
	</div>
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
			<th>Operations</th>
		</tr>
		<c:forEach var="tempProduct" items="${product}">

			<c:url var="updateLink" value="/admin/updateProduct">
				<c:param name="productId" value="${tempProduct.id}" />
			</c:url>

			<c:url var="deleteLink" value="/admin/deleteProduct">
				<c:param name="productId" value="${tempProduct.id}" />
			</c:url>

			<tr>
				<td>${tempProduct.id}</td>
				<td>${tempProduct.name}</td>
				<td>${tempProduct.description}</td>
				<td>${tempProduct.brand}</td>
				<td>${tempProduct.category}</td>
				<td>${tempProduct.price}</td>

				<td><a href="${updateLink}">Update</a> <a href="${deleteLink}">Delete</a>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>