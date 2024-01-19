<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.crud.dao.UserDao" %>
<jsp:useBean id="u" class="com.crud.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
int i = UserDao.save(u);
if(i > 0) {
	response.sendRedirect("addUserSuccess.jsp");
} else {
	response.sendRedirect("addUserError.jsp");
}
%>