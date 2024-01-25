<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File Upload</title>
</head>
<body>
<% 
MultipartRequest m = new MultipartRequest(request, "E:/New folder");

out.println("<h2>File Uploaded Successfully!</h2>");
%>
</body>
</html>