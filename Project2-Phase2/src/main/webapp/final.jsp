<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
ServletContext context = getServletContext();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Confirmed</title>
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
	<h3>Hey, Your booking is confirmed...</h3>
	<table class="center">
		<tr>
			<th>Passenger Name</th>
			<th>Passenger Age</th>
			<th>Passenger Mobile</th>
			<th>Passenger Email</th>
			<th>Date</th>
			<th>Time</th>
			<th>Source</th>
			<th>Destination</th>
		</tr>
		<tr>
			<th>"<%=context.getAttribute("pname")%>"
			</th>
			<th>"<%=context.getAttribute("page")%>"
			</th>
			<th>"<%=context.getAttribute("pmobile")%>"
			</th>
			<th>"<%=context.getAttribute("pemail")%>"
			</th>
			<th>"<%=context.getAttribute("date")%>"
			</th>
			<th>"<%=context.getAttribute("time")%>"
			</th>
			<th>"<%=context.getAttribute("source")%>"
			</th>
			<th>"<%=context.getAttribute("destination") %>"
			</th>
		</tr>
	</table>
</body>
</html>