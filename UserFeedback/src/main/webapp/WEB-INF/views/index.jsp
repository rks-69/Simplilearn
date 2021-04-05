<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
<style>
body {
	background-color: powderblue;
}

.form {
	text-align: center;
}
h1{text-align:center;}
</style>
</head>
<body>
	<h1>Please Submit your Valuable Feedback and Help Us Improve!</h1>
	<form:form action="save" method="post" class="form" modelAttribute="feedbacks">
		<br />
		<br />
		<br /> Name : <form:input type="text" path="name" placeholder="Your Name" />
		<br />
		<br />
		<br /> Feedback :
		<form:textarea rows="2" cols="30" path="feedback"
			placeholder="Enter your feedback" />
		<br />
		<br />
		<br /> <button type="submit">Save Feedback</button>
	</form:form>
</body>
</html>