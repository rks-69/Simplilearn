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

.labels {
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
	<h2>Listing All Signed In Users</h2>
	<br />
	<br />
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
		</tr>
		<c:forEach var="tempUser" items="${user}">
			<tr>
				<td>${tempUser.id}</td>
				<td>${tempUser.name}</td>
				<td>${tempUser.email}</td>
				<td>${tempUser.gender}</td>
			</tr>
		</c:forEach>

	</table>
	<br />
	<br />
	<div class="labels">
		<a href="/admin/list"> <input type="submit"
			value="Return to List Page">
		</a>
	</div>
</body>
</html>