<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<jstl:if test='${sessionScope.username != "null" }'>
<h3>Hello ${sessionScope.username}</h3>
</jstl:if>
<div align="right">
<jstl:if test='${sessionScope.username.equals("admin") }'>
<h4><a href="logout.app">Logout</a></h4>
</jstl:if>
</div>
</body>
</html>