<%@page import="com.resume.bean.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
<% Resume resume=(Resume)request.getAttribute("resume"); %>
<h1><%=resume.getFirstName() %></h1>
<h1><%=resume.getLastName() %></h1>
<h1><%=resume.getGender() %></h1>

</body>
</html>