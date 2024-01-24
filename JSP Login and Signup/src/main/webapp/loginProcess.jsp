<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jspLogin.dao.UserDao" %>
<%@ page import="com.jspLogin.bean.User" %>
<jsp:useBean id="obj" class="com.jspLogin.bean.User" />
<jsp:setProperty property="*" name="obj" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login!</title>
</head>
<body>
<% 
boolean status = UserDao.logVal(obj);
if(status) {
	session.setAttribute("session", "TRUE");
	session.setAttribute("user", obj.getName());
	response.sendRedirect("loginSuccess.jsp");
} else {
	response.sendRedirect("loginFailed.jsp");
}
%>
</body>
</html>