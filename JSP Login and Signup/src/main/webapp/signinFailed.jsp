<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In Failed!</title>
<style>
.err {
color: red;
}
</style>
</head>
<body>
<p class="err">User name already exists,</p>
<p class="err">Use different user name!</p>
<br />

<form action="signinProcess.jsp" method="post">
User Name : <input type="text" name="name" required /><br><br>
Password : <input type="password" name="pass" required /><br><br>
<input type="submit" value="login">
</form>
<br />
<p><a href="index.jsp">Home</a></p>
</body>
</html>