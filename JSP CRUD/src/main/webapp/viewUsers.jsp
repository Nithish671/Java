<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Users</title>
</head>
<body>
<%@page import="com.crud.dao.UserDao, com.crud.bean.*, java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Users List</h1>

<%
List<User> list = UserDao.getAllRecords();
request.setAttribute("list", list);
%>

<table border="1" style="width:100%">
<tr><th>Id</th><th>Name</th><th>Password</th><th>E-Mail</th><th>Gender</th><th>Universe</th><th>Edit</th><th>Delete</th></tr>

<c:forEach items="${list}" var="u">
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td><td>${u.getEmail()}</td><td>${u.getGender()}</td><td>${u.getUniverse()}</td><td><a href="editForm.jsp?id=${u.getId()}">Edit</a></td><td><a href="deleteUser.jsp?id=${u.getId()}">Delete</a></td></tr>
</c:forEach>
</table>
<br>
<h2><a href="addUserForm.jsp">Add New User</a></h2>
</body>
</html>