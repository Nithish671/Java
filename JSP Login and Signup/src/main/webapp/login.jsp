<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login!</title>
</head>
<body>
<%@ include file="links.html" %>
<hr />

<h1>Login!</h1>

<%
String profile_msg = (String)request.getAttribute("profile_msg");

if(profile_msg != null) {
	out.println(profile_msg);
}

String login_msg = (String)request.getAttribute("login_msg");
if(login_msg != null) {
	out.println(login_msg);
}
%>
<br />

<form action="loginProcess.jsp" method="post">
User Name : <input type="text" name="name" required /><br><br>
Password : <input type="password" name="pass" required /><br><br>
<input type="submit" value="login">
</form>
</body>
</html>