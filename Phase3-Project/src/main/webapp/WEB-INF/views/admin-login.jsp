<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
body {
	background-color: powderblue;
}

.center {
	text-align: center;
}
</style>
</head>
<body>
	<br />
	<br />
	<div class="center">
		<h2>Login to Admin Portal</h2>
		<br />
		<br /> <label>Username:</label> <input type="text" name="username"
			placeholder="Enter Username" /> <br />
		<br /> <label>Password:</label> <input type="password" name="password"
			placeholder="Enter Password" /> <br />
		<br />
		<%
		String uname = (String) request.getAttribute("username");
		String pass = (String) request.getAttribute("password");
		if (uname == "admin" && pass == "admin") {
			String url = "http://localhost:8084/admin/list";
			response.sendRedirect(url);
		}
		%>
		<a href="/admin/list"> <input type="submit" value="Login">
		</a>



	</div>
</body>
</html>