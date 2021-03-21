<%@page import="java.sql.*"%>
<%
String source = request.getParameter("source");
String destination = request.getParameter("destination");
String airlines = request.getParameter("airlines");
String passengers = request.getParameter("passengers");
String date = request.getParameter("date");
String time = request.getParameter("time");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "details";
String userid = "root";
String password = "admin";
try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<title>Flight Details</title>
<style>
body {
	background-color: powderblue;
}

h1 {
	text-align: center;
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

a {
	text-align: center;
}
</style>
</head>
<body>

	<h1>Details of your flights</h1>
	<table border="1" class="center">
		<tr>
			<td>Source</td>
			<td>Destination</td>
			<td>Airlines</td>
			<td>Fare</td>

		</tr>
		<%
		connection = DriverManager.getConnection(connectionUrl + database, userid, password);
		//statement = connection.createStatement();
		String sql = "select * from details where source=? and destination=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, source);
			ps.setString(2, destination);
			resultSet = ps.executeQuery();
			while (resultSet.next()) {
		%>
		<tr>
			<td><%=resultSet.getString("source")%></td>
			<td><%=resultSet.getString("destination")%></td>
			<td><%=resultSet.getString("airlines")%></td>
			<td><%=resultSet.getString("fare")%></td>
		</tr>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
		<%
		ServletContext context = getServletContext();
		context.setAttribute("source", source);
		context.setAttribute("destination", destination);
		context.setAttribute("airlines", airlines);
		context.setAttribute("passengers", passengers);
		context.setAttribute("date", date);
		context.setAttribute("time", time);
		%>
	</table>
	<br />
	<br />
	<a class="center" href="checkout.jsp"> <input type="submit"
		value="Proceed for Payment" style="margin-left: 50%">
	</a>
	<br />
	<br />
</body>
</html>