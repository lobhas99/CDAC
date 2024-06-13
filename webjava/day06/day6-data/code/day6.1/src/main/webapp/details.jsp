<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--sessionScope.get("user_details") --%>
	<h4>Validate User Details : ${sessionScope.user_details}</h4>
	<h5>
	<%
	 String url=response.encodeURL("logout.jsp");
	%>
		<a href="<%= url %>">Log Out</a>
	</h5>
</body>
</html>