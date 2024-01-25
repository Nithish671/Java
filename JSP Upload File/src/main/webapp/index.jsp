<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File Upload</title>
</head>
<body>
<form action="upload.jsp" method="post" encType="multipart/form-data">
Select File : <input type="file" name="fname" /><br><br>
<input type="image" src="fileUpload.png" />
<input type="submit" value="Upload" />
</form>
</body>
</html>