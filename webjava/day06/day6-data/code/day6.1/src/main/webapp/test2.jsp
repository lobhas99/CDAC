<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String mesg = "some mesg!!!";//mesg : local var
	pageContext.setAttribute("num", 12345);//num : page scoped attribute
	%>
	<%@ include file="test3.jsp"%>
</body>
</html>