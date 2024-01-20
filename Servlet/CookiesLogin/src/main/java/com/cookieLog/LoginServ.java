package com.cookieLog;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/LoginServ")

public class LoginServ extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
				
		req.getRequestDispatcher("link.html").include(req, res);
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(pass.equals("Gojo")) {
			out.print("<p>You are successfully logged in!</p>");
			out.print("<p>Welcome " + name);
			
			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);
			
		} else {
			out.println("<p>Sorry, username or password incorrect.</p>");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		
	}
}
