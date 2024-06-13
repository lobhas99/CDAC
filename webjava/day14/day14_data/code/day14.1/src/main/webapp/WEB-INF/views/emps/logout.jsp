<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Hello , ${requestScope.firstName} ${requestScope.lastName}</h5>
	<h6>You have logged out....</h6>
	<h5 align="center">
		<a href="<spring:url value='/'/>">Visit Again</a>
	</h5>
</body>
</html>