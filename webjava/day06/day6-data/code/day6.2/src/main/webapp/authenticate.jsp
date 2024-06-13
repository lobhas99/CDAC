<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%--import JSTL supplied core tag library --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="user_bean" class="beans.UserBean" scope="session" />
<jsp:setProperty property="*" name="user_bean" />
<body>
	<%--session.getAttribute("user_bean").validateUser() : sent to clnt --%>
	<%-- <h5>Login status : ${sessionScope.user_bean.validateUser()}</h5> --%>
	<%--Navigate the clnt to the next page in the SAME request --%>
	<c:redirect url="${sessionScope.user_bean.validateUser()}.jsp"/>
</body>
</html>