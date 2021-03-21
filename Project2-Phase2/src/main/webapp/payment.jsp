<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
ServletContext context = getServletContext();
String pname = request.getParameter("pname");
String psage = request.getParameter("page");
String pmobile = request.getParameter("pmobile");
String pemail = request.getParameter("pemail");
context.setAttribute("pname", pname);
context.setAttribute("page", psage);
context.setAttribute("pmobile", pmobile);
context.setAttribute("pemail", pemail);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Confirmation</title>
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
	<h2>Confirm Booking</h2>
	<form action="final.jsp" method="post">
		Card Number <input type="text" placeholder="card number" name="pcard">
		<br />
		<br /> Card Holder Name <input type="text"
			placeholder="card holder name" name="cardholder"> <br />
		<br /> Card Expiry Date <input type="date" value="2021-03-01"
			name="pcard"> <br />
		<br /> Enter CVV <input type="text" placeholder="CVV" name="cvv">
		<br />
		<br />
		<h4>Your total payment is Rs. param:${fare}</h4>
		<input type="submit" value="Confirm Payment"> <br />
		<br />
	</form>
</body>
</html>