<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
<jsp:include page="header.jsp" />
</div>
<form action="login.app" method="post">
Enter User name:<input type="text" name="userName" /><br>
Enter Password:<input type="password" name="password" /><br><br>
<input type="submit" value="Login" />
</form>
<div>
<jsp:include page="footer.jsp" />
</div>
</body>
</html>