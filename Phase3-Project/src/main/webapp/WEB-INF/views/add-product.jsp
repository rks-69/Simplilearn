<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
<style>
body {
	background-color: powderblue;
}

table, th, td {
	margin-left: auto;
	margin-right: auto;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<br />
	<br />
	<h2>Add New Product to the Store</h2>
	<br />
	<br />
	<form:form action="saveProduct" modelAttribute="product" method="post">
		<form:hidden path="id" />
		<table>
			<tbody>
				<tr>

					<td><label>Product Name:</label></td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td><label>Product Description:</label></td>
					<td><form:input path="description" /></td>
				</tr>

				<tr>
					<td><label>Product Brand:</label></td>
					<td><form:input path="brand" /></td>
				</tr>

				<tr>
					<td><label>Product Category:</label></td>
					<td><form:input path="category" /></td>
				</tr>

				<tr>
					<td><label>Product Price:</label></td>
					<td><form:input path="price" /></td>
				</tr>

				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save Product" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>