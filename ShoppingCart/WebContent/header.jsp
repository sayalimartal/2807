<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
<h4>Welcome to Book Shopping portal &#8208;</h4>

<h4><a href="viewcart.app">Cart(${sessionScope.cartCount})</a></h4>

</body>
</html>