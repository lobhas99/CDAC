<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--send admin name n role to the clnt--%>
	<%--session.getAttribute("user_bean").getUserDetails().getFirstName() --%>
	<h5>Hello , ${sessionScope.user_bean.userDetails.firstName}
		${sessionScope.user_bean.userDetails.lastName}</h5>
		<h6>Currently logged in under ${sessionScope.user_bean.userDetails.role}  role</h6>

</body>
</html>