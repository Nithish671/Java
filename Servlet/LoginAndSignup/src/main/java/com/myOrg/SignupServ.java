package com.myOrg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SignupServ extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("newuser");
		String password = req.getParameter("setpass");
		
		AddUser idCheck = new AddUser();
		idCheck.userReg(userName, password);
		boolean regSt = idCheck.regStatus;
		
		if(regSt) {
			out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n" + "<title>Login Successful</title>\n" + "</head>\n" + "<body>");
			out.println("<h1>Registration Successful!</h1>");
			out.println("<h2>Username " + userName + " has been successfully registered.</h2>");
			out.println("<p><a href=\"login.html\">Return to login page</p>");
			out.println("</body>\n</html>");
		} else {
			out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n" + "<title>Login Successful</title>\n" + "</head>\n" + "<body>");
			out.println("<h1>Registration Failed!</h1>");
			out.println("<h2>Username is already exist try different username</h2>");
			out.println("<p><a href=\"signup.html\">Return to signup page</p>");
			out.println("</body>\n</html>");
		}
	}
}

