<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Sporty Shoes</title>
<style>
body {
	background-color: powderblue;
}

h1 {
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
	<div class="labels">
		<h1>New User! Register below to start</h1>
		<br /> <a href="/register"> <input type="submit" value="Register">
		</a> <br /> <br />
		<h1>Admin! Login Below to Continue</h1>
		<br /> <a href="/admin/login"> <input type="submit"
			value="Admin Login">
		</a>
	</div>
</body>
</html>