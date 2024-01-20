package com.cookieLog;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/LogoutServ")

public class LogoutServ extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		Cookie ck = new Cookie("name", "");
		ck.setMaxAge(0);
		res.addCookie(ck);
		
		out.println("You are successfully logged out");
	}
}