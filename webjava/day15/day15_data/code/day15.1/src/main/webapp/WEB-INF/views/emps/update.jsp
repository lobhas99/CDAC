<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--def value of the action is the same URL /employees/update --%>
	<form method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Employee ID</td>
				<td><input type="number" name="empId" readonly
					value="${param.id}" /></td>
			</tr>

			<tr>
				<td>Employee Salary</td>
				<td><input type="number" name="salary" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Salary" /></td>
			</tr>
		</table>
	</form>
</body>
</html>