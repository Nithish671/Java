<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jspLogin.dao.UserDao" %>
<%@ page import="com.jspLogin.bean.User" %>
<jsp:useBean class="com.jspLogin.bean.User" id="obj" />
<jsp:setProperty property="*" name="obj" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in Process</title>
</head>
<body>
<% 
boolean stat = UserDao.userCheck(obj);

if(stat) {
	int status = UserDao.signVal(obj);
	session.setAttribute("regUser", obj.getName());
	response.sendRedirect("signinSuccess.jsp");
} else {
	response.sendRedirect("signinFailed.jsp");
}
%>
</body>
</html>