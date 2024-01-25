<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.nio.file.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File Download!</title>
</head>
<body>
<% 
String filePath = "E:/New folder/zoro.png";
String fileName = "zoro.png";

response.setContentType("image/png");
response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");

try {
	InputStream in = new FileInputStream(filePath);
	OutputStream out1 = response.getOutputStream();
	byte[] buffer = new byte[4096];
	int bytesRead;
	
	while((bytesRead = in.read(buffer)) != -1) {
		out1.write(buffer, 0, bytesRead);
	} 
} catch(IOException e) {
	e.printStackTrace();
}
%>
</body>
</html>