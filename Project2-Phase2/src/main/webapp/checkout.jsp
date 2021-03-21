<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.simplilearn.training.Passenger"%>
<%
ServletContext context = getServletContext();
String source = request.getParameter("source");
String destination = request.getParameter("destination");
String passengers = request.getParameter("passengers");
String date = request.getParameter("date");
String time = request.getParameter("time");
String fare = request.getParameter("fare");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout Page</title>
<style>
body {
	background-color: powderblue;
}

table {
	border: 1px solid black;
}

.center {
	margin-left: auto;
	margin-right: auto;
}

th, td {
	border: 1px solid black;
}

h3 {
	text-align: center;
}

form {
	text-align: center;
}
</style>
</head>
<body>
	<h3>Complete your Payment</h3>
	<table class="center">
		<tr>
			<th>Source</th>
			<th>Destination</th>
			<th>Passengers</th>
			<th>Date</th>
			<th>Time</th>
		</tr>
		<tr>
			<th>"<%=context.getAttribute("source")%>"
			</th>
			<th>"<%=context.getAttribute("destination")%>"
			</th>
			<th>"<%=context.getAttribute("passengers")%>"
			</th>
			<th>"<%=context.getAttribute("date")%>"
			</th>
			<th>"<%=context.getAttribute("time")%>"
			</th>

		</tr>
	</table>
	<br />
	<br />
	<form action="payment.jsp" method="post">
		Passenger Name <input type="text" placeholder="Enter your name"
			name="pname"> <br />
		<br /> Passenger Age <input type="text" placeholder="Enter your age"
			name="page"> <br />
		<br /> Mobile Number <input type="text"
			placeholder="Enter your mobile numner" name="pmobile"> <br />
		<br /> Email <input type="text" placeholder="Enter your email"
			name="pemail"> <br />
		<br /> <input type="submit" value="Proceed to Pay">

	</form>

</body>
</html>