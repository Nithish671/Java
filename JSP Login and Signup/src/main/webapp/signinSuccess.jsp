<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in Successful!</title>
</head>
<body>
<h1>Sign in Successful!</h1>
<% 
out.println("<h2>Welcome " + session.getAttribute("regUser") +"!</h2>");
out.println("<p>You Successfully Signed In!</p>");
%>
<br  />
<p><a href="index.jsp">Home</a></p>
</body>
</html>