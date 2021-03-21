<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Login Page</title>
<style>
body {
	background-color: powderblue;
}

h2 {
	text-align: center;
}

form {
	text-align: center;
}
</style>
</head>
<body>
	<h2>Welcome to FlyAway Online Flight Booking System</h2>
	<br />
	<br />
	<form action="LoginServlet" method="post">
		Username : <input type="text" placeholder="Username" name="username">
		<br /> <br /> Password : <input type="password"
			placeholder="Password" name="password"> <br /> <br /> Login
		: <input type="submit" value=Login> <br /> <br /> Reset : <input
			type="reset" value="Reset">
	</form>
</body>
</html>