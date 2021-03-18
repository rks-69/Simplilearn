<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registratione</title>
</head>
<body>
	<h1>Welcome to Product Registration Page</h1>
	<br />
	<br />
	<h4>Enter the Product Details</h4>
	<br />
	<br />
	<form action="ProductServlet" method="post">
		Product ID : <input type="text" placeholder="Product ID"
			name="productid"> <br />
		<br /> Product Name : <input type="text" placeholder="Product Name"
			name="productname"> <br />
		<br /> Product Cost : <input type="text" placeholder="Product Cost"
			name="productcost"> <br />
		<br /> Product Quantity : <input type="text"
			placeholder="Product Quantity" name="productquantity"> <br />
		<br /> Submit : <input type="submit" value="Submit"> <br />
		<br /> Reset : <input type="reset" value="Reset"> <br />
		<br />
	</form>
</body>
</html>