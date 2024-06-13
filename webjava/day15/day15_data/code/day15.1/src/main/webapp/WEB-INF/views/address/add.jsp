<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import spring supplied form tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assign Emp Address</title>
</head>
<body>
	<form:form method="post" modelAttribute="address">
		<table style="background-color: lightgrey; margin: auto">
			<caption>Add Emp Address</caption>
			<tr>
				<td>Enter Street</td>
				<td><form:input path="street" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>Enter State</td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td>Enter Country</td>
				<td><form:input path="country" /></td>
			</tr>
			<tr>
				<td>Enter Zip Code</td>
				<td><form:input path="zipCode" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Link Employee Address" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>