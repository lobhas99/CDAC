<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Hello , ${sessionScope.emp_details.firstName}</h5>
	<h6>Your Registered Details with us : ${sessionScope.emp_details}</h6>
	<%--assign address , adhaar card here  --%>
	<h5 align="center">
		<a href="<spring:url value='/employees/logout'/>">Log Out </a>
	</h5>

</body>
</html>