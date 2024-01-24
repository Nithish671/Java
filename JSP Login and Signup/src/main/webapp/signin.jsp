<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in!</title>
</head>
<body>
<%@ include file="links.html" %>

<hr />

<h1>Sign In!</h1>

<form action="signinProcess.jsp" method="post">
User Name : <input type="text" name="name" required /><br><br>
Password : <input type="password" name="pass" required /><br><br>
<input type="submit" value="Sign In">
</form>
</body>
</html>