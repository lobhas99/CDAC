<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>From 1st page ....</h5>
	<%
	out.flush();
	int pid = Integer.parseInt(request.getParameter("product_id"));
	double price = Double.parseDouble(request.getParameter("price"));
	request.setAttribute("product_dtls", pid + ":" + price);
	pageContext.setAttribute("nm", 1234);
	%>
	<jsp:include page="test7.jsp">
		<jsp:param value="grains" name="category" />
		<jsp:param value="100" name="stock"/>
	</jsp:include>
</body>
</html>