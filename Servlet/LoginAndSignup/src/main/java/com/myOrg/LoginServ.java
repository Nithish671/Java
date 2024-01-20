package com.myOrg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServ extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userId = req.getParameter("username");
		String pass = req.getParameter("password");
		
		DataRetrive obj = new DataRetrive();
		obj.getLogin(userId, pass);
		boolean auth = obj.status;
		
		if(auth) {
			out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n" + "<title>Login Successful</title>\n" + "</head>\n" + "<body>");
			out.println("<h1>Login Successful!</h1>");
			out.println("<h2>Welcome " + userId + "</h2>");
			out.println("<p><a href=\"login.html\">Return to login page</p>");
			out.println("</body>\n</html>");
		} else {
			out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n" + "<title>Login Successful</title>\n" + "</head>\n" + "<body>");
			out.println("<h1>Login Failure!</h1>");
			out.println("<h2>Username or password incorrect...</h2>");
			out.println("<p><a href=\"login.html\">Click to try again...</p>");
			out.println("</body>\n</html>");
		}
	}
}