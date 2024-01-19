<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>
<%@page import="com.crud.dao.UserDao, com.crud.bean.User" %>
<% 
String id = request.getParameter("id");
User u = UserDao.getRecordsById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="editUser.jsp" method="post">
<input type="hidden" name="id" value="<%= u.getId() %>" />

<table>
<tr><td>Name:</td><td><input type="text" name="name" value="<%= u.getName() %>" /></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" value="<%= u.getPassword() %>" /></td></tr>
<tr><td>E-Mail:</td><td><input type="email" name="email" value="<%= u.getEmail() %>" /></td></tr>
<tr><td>Gender:</td><td><input type="radio" name="gender" value="Male" required />Male<input type="radio" name="gender" value="Female" required />Female</td></tr>
<tr><td>Universe:</td>
<td>
<select name="universe">
<option>Dragon Ball</option>
<option>Jujutsu Kaisen</option>
<option>One Piece</option>
<option>Bleach</option>
<option>Naruto</option>
<option>Attack On Titan</option>
</select>
</td>
</tr>
<tr><td colspan="2"><input type="submit" value="Edit User" /></tr>
</table>
</form>
</body>
</html>