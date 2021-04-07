<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New User</title>
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
	<h2>New User Registration</h2>
	<br />
	<br />
	<form:form action="saveUser" modelAttribute="user" method="post">
		<form:hidden path="id" />
		<table>
			<tbody>
				<tr>

					<td><label>Name:</label></td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td><label>Gender:</label></td>
					<td><form:input path="gender" /></td>
				</tr>

				<tr>
					<td><label>Email:</label></td>
					<td><form:input path="email" /></td>
				</tr>

				<tr>
					<td><label>User Name:</label></td>
					<td><form:input path="username" /></td>
				</tr>

				<tr>
					<td><label>Password:</label></td>
					<td><form:input type="password" path="password" /></td>
				</tr>

				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>