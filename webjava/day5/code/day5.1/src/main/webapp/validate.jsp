<%@page import="pojos.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!//declare n instantiate a HashMap n populate
	HashMap<String, User> users;//private scoped var.

	public void jspInit() {
		//instantiate a HashMap n populate
		users = new HashMap<>();
		//put 
		users.put("Rama", new User("Rama", "12345", 25));
		users.put("Shubham", new User("Shubham", "2345", 35));
		users.put("Riya", new User("Riya", "1245", 27));
	}%>
<body>
	<%
	//plain old java code : equivalent to doXXX
	//validation based on HashMap
	String userName = request.getParameter("nm");
	String password = request.getParameter("pass");
	User user = users.get(userName);
	if (user != null) {
		//=> user name found --> chk pwd
		if (password.equals(user.getPassword())) {
			//=> login success
			//save user details under session scope
			session.setAttribute("user_details", user);
			//encode URL +redirect 
			response.sendRedirect(response.encodeRedirectURL("details.jsp"));
		} else { //invalid password
	%>
	<h5 style="color: red;">
		Invalid Password , Please <a href="login2.jsp">Retry</a>
	</h5>
	<%
	}
	} else { //invalid username
	%>
	<h5 style="color: red;">
		Invalid User Name , Please <a href="register.jsp">Register</a>
	</h5>
	<%
	}
	%>
</body>
</html>