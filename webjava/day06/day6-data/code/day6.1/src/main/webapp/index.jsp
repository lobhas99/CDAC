<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h4>
		Session ID :
		<%=session.getId()%></h4>
	<h5>
		Welcome 2 JSP !!!!
		<%=LocalDateTime.now()%></h5>
	<h5>
		<a href="comments.jsp">Test JSP Comments</a>
	</h5>
	<h5>
		<a href="login.jsp">Test Scripting elements</a>
	</h5>
	<h5>
		<a href="login2.jsp">User Login</a>
	</h5>
	<h5>
		<a href="test1.jsp">Centralized Error Handling</a>
	</h5>
	<h5>
		<a href="test2.jsp">JSP include directive</a>
	</h5>
	<h5>
		<a href="test4.jsp?product_id=123&name=wheat&price=100">JSP forward action</a>
	</h5>
	<h5>
		<a href="test6.jsp?product_id=123&name=wheat&price=100">JSP include action</a>
	</h5>

</body>
</html>