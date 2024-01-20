<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.rf.dao.RegisterDao" %>
<jsp:useBean id="u" class="com.rf.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Registration Form</title>
</head>
<body>
<% 
int status = RegisterDao.register(u);
if(status > 0) {
	out.println("<h2>Username " + u.getName() + " has been registered</h2>");
} else {
	out.println("<h2>An error occured!</h2>");
}
%>
<br>
<p><a href="index.jsp">Register another user</a></p>
</body>
</html>