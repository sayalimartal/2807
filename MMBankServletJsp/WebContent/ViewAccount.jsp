<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Account</title>
</head>
<body>
<div align="center">
<h1>Account Holder List</h1>
<jstl:if test="${requestScope.bankAccount != null }">
<table>
<tr>
<!-- <th>AccountNumber</th>
<th>CustomerId</th>
<th>AccountType</th>
<th>AccountBalance</th>
<th>Overdraft Limit</th>
<th>salaryAccount ?</th> -->
</tr>
<%-- <jstl:forEach var="bankAccount" items="${requestScope.bankAccount}"> --%>
<tr>
<td>${bankAccount.accountNumber}</td>
<td>${bankAccount.customer.getcustomerId()}</td>
<%-- <td>${bankAccount.accountType}</td> --%>
<td>${bankAccount.accountBalance}</td>
<%-- <td>${classType.equals('com.moneymoney.app.model.account.pojo.MMSavingsAccount')}</td>
<td>${classType.equals('com.moneymoney.app.model.account.pojo.MMCurrentAccount')}</td> --%>
<jstl:if test="${classType.equals('com.moneymoney.app.model.account.pojo.MMCurrentAccount')}" >
<td>${bankAccount.odLimit}</td>
</jstl:if>
<jstl:if test="${classType.equals('com.moneymoney.app.model.account.pojo.MMSavingsAccount')}">
<td>${bankAccount.salaryValue}</td>
</jstl:if> 
</table>
</jstl:if>
<jstl:if test="${requestScope.bankAccount == null }">
<h4>No Account Found!</h4>
</jstl:if>
</div>
</body>
</html>