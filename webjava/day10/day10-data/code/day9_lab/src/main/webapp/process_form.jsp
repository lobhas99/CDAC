<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:setProperty property="*" name="player_bean"/>
<body>
<h3>Player Status: ${sessionScope.player_bean.validateAndAddPlayer()}</h3>
</body>
</html>