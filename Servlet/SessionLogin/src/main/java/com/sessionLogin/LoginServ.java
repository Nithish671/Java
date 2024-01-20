package com.sessionLogin;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginServ")

public class LoginServ extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(pass.equals("user123")) {
			out.println("<h2>Welcome " + name + "</h2>");
			HttpSession ses = req.getSession();
			ses.setAttribute("name", name);
		} else {
			out.println("<p>Sorry, username or password is incorrect</p>");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		out.close();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	
}
