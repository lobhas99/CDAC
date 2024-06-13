<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%--import JSTL n spring tag libs --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="abc" value="${sessionScope.message}" />
	<h5>Last Action : ${abc}</h5>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Employee List from Department ID : ${param.deptId}</caption>
		<tr>
			<th>Emp ID</th>
			<th>Emp First Name</th>
			<th>Emp Last Name</th>
			<th>Salary</th>
			<th>Join Date</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="emp" items="${requestScope.emp_list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.salary}</td>
				<td>${emp.joinDate}</td>
				<spring:url var="url" value="/employees/update?id=${emp.id}" />
				<td><a href="${url}">Update</a></td>
				<spring:url var="url" value="/employees/delete?id=${emp.id}" />
				<td><a href="${url}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<c:remove var="abc" />
</body>
</html>