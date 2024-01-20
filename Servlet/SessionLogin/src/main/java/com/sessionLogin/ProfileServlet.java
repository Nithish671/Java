package com.sessionLogin;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ProfileServlet")

public class ProfileServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		HttpSession ses = req.getSession(false);
		if(ses != null) {
			String name = (String)ses.getAttribute("name");
			
			out.println("<h2>Hello, " + name + " Welcome to profile!");
		} else {
			out.println("<p>Please login first!</p>");
			req.getRequestDispatcher("login.html").include(req, res);
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
}