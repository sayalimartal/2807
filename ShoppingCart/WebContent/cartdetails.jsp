<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<div>
		<jsp:include page="header.jsp"></jsp:include>
</div>
<jstl:if test="${sessionScope.cartCount>0}">
<div style="align: center;">
	<h1>Books List</h1>
</div>
		<table>
			<tr>
				<th>Book Name</th>
  				<th>Author Name</th>
  				<th>Description</th>
  				<th>Price</th>	
  				<th>Book Count</th>	
			</tr>
			<jstl:forEach var="book" items="${sessionScope.cartItems}">
				<tr>
					<td>${book.bookName}</td>
					<td>${book.authorName}</td>
					<td>${book.description}</td>
					<td>${book.price}</td>
					<td>${book.bookCount}</td>
					<td><a href="remove.app?bookId=${book.bookId}">Remove from Cart</a></td>
<!--  					<td><a href="select.app?bookId=${book.bookId}">Select</a></td> -->	
				</tr>
			</jstl:forEach>
			</table>
</jstl:if>
<jstl:if test="${sessionScope.cartCount==0}">
<h4>Empty Cart!</h4>
</jstl:if>
</body>
</html>