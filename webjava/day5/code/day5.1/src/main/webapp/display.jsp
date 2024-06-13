<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!//JSP declaration block
	public void jspInit() {
		System.out.println("in jsp init");
	}%>
<body>
	<h4>Session ID : ${cookie.JSESSIONID.value}</h4>
	<%--out.print(pageContext.getSession().getId()) --%>
	<h4>Session ID : ${pageContext.session.id}</h4>

	<h4>Results via JSP scriptlet</h4>
	<%
	System.out.println("  in _jspService " + Thread.currentThread());
	String email = request.getParameter("em");
	String password = request.getParameter("pass");
	out.print("Email " + email + "<br/>");
	out.print("Password " + password);
	//add an attribute under the curnt page scope
	pageContext.setAttribute("server_ts", LocalDateTime.now());
	%>
	<hr />
	<h4>Results via JSP Expression</h4>
	<h5>
		Email :
		<%=request.getParameter("em")%></h5>
	<h5>
		Password :
		<%=request.getParameter("pass")%></h5>
	<hr />
	<h5>
		page :
		<%=page%></h5>
	<h5>
		pageContext
		<%=pageContext%></h5>
	<%--display value of page scope attr using EL syntax --%>
	<h5> Page scoped attribute : ${pageScope.server_ts}</h5>
</body>
<%!//JSP declaration block
	public void jspDestroy() {
		System.out.println("in jsp destroy");
	}%>
</html>