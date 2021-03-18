<%@page import="org.simplilearn.training.Product.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<h2>Product Details Form</h2>
Product ID : <%= request.getAttribute("pid") %>
<br/><br/>
Product Name : <%= request.getAttribute("pname") %>
<br/><br/>
Product Cost : <%= request.getAttribute("pcost") %>
<br/><br/>
Product Quantity : <%= request.getAttribute("pquantity") %>
<br/><br/>
</body>
</html>