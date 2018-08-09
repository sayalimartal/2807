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
<jstl:if test='${sessionScope.username != null }'>
<div>
<jsp:include page="header.jsp" />
</div>
<div align="center">
<h3>Hello ${sessionScope.username}</h3>
<h3>You have successfully logged in..</h3>
</div>
<div>
<jsp:include page="footer.jsp" />
</div>
</jstl:if>
</body>
</html>
