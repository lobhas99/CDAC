<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import spring supplied JSP tag library --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Dept List</h5>
	<spring:url var="url" value="/employees/list"/>
	<form action="${url}" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Choose a Department</td>
				<td><select name="deptId">
						<c:forEach var="dept" items="${requestScope.dept_list}">
							<option value="${dept.id}">${dept.name}</option>
						</c:forEach>
				</select></td>

			</tr>
			<tr>
				<td><input type="submit" value="Choose A Department" /></td>
			</tr>
		</table>
	</form>
</body>
</html>