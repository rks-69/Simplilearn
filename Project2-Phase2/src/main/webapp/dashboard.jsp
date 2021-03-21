<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Dashboard</title>
<style>
body {
	background-color: powderblue;
}

h2, h3 {
	text-align: center;
}

form {
	text-align: center;
}
</style>
</head>
<body>
	<h2>Login Successful</h2>
	<br />
	<br />
	<h3>Welcome to FlyAway Online Ticket Booking</h3>
	<br />
	<br />
	<form action="booktickets.jsp" method="post">
		<label for="source">Source</label> <select name="source">
			<option value="delhi">Delhi</option>
			<option value="mumbai">Mumbai</option>
			<option value="pune">Pune</option>
			<option value="bangalore">Bangalore</option>
			<option value="hyderabad">Hyderabad</option>
		</select> <br /> <br /> <label for="destination">Destination</label> <select
			name="destination">
			<option value="delhi">Delhi</option>
			<option value="mumbai">Mumbai</option>
			<option value="pune">Pune</option>
			<option value="bangalore">Bangalore</option>
			<option value="hyderabad">Hyderabad</option>
		</select> <br /> <br /> Number of Passengers <input type="text"
			placeholder="Total Passengers" name="passengers"> <br /> <br />
		Date of Journey <input type="date" value="2021-03-01" name="date">
		<br /> <br /> Time of Journey <input type="time" value="13:30"
			name="time"> <br /> <br />
		<td><input type="submit" value="Book Tickets"> or <input
			type="reset" value="Reset"></td>
	</form>
</body>
</html>