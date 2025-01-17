<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import tag lib --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="process_form.jsp" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Select Team</td>
				<td><select name="teamId">
						<c:forEach var="team"
							items="${sessionScope.team_bean.teamDetails}">
							<option value="${team.id}">${team.abbreviation}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="fn" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="ln" /></td>
			</tr>
			<tr>
				<td>Select DoB</td>
				<td><input type="date" name="dob" /></td>
			</tr>
			<tr>
				<td>Enter Batting Average</td>
				<td><input type="number" value="0.00" step="0.01" name="avg" /></td>
			</tr>
			<tr>
				<td>Enter No Of Wickets Taken</td>
				<td><input type="number" name="wickets" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add A Player" /></td>
			</tr>
		</table>
	</form>
	
</body>


</html>