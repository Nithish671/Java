package com.cookieLog;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/ProfileServ")

public class ProfileServ extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		Cookie ck[] = req.getCookies();
		if(ck!=null) {
		String name = ck[0].getValue();
		
		if(!name.equals("")||name!=null) {
			out.println("<h2>Welcome to profile</h2>");
			out.println("<p>Welcome " + name + "</p>");
		}
		} else {
			out.println("<p>Please login first!</p>");
			req.getRequestDispatcher("login.html").include(req, res);
		}
	}
	
}