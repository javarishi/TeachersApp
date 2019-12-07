package com.h2kinfosys.teachers.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Complete Browser Clock

public class TeacherServlet extends HttpServlet{
	
	// Step 1 - initialization 
	
	@Override
	public void init() throws ServletException {
		System.out.println("TeacherServlet is initialized");
	}

	// Step 2 - Service Method
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		String teacherId = req.getParameter("teacherId");
		// MIME type - https://www.freeformatter.com/mime-types-list.html
		// resp.setContentType("");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		
		out.println("req.getContentType() :: " + req.getContentType());
		
		Enumeration<String> params = req.getParameterNames();
		String eachParam = null;
		out.println("<p>");
		while(params.hasMoreElements()) {
			eachParam = params.nextElement();
			out.println("Parameter Name : " + eachParam + " Parameter Value " + req.getParameter(eachParam));
			out.println("<br>");
		}
		out.println("</p>");
		
		Enumeration<String> headers = req.getHeaderNames();
		String eachHeader = null;
		
		out.println("<p>");
		while(headers.hasMoreElements()) {
			eachHeader = headers.nextElement();
			out.println("Header Name : " + eachHeader + " Header Value " + req.getHeader(eachHeader));
			out.println("<br>");
		}
		out.println("</p>");
		
		out.println("<p>");
		Cookie[] cookies = req.getCookies();
		for(Cookie eachCookie : cookies) {
			out.println("Cookiee Name : " + eachCookie.getName() + " Cookiee Value " + eachCookie.getValue());
			out.println("<br>");
		}
		out.println("</p>");
		
		out.println("<p>");
		out.println("TeacherId Received :: " + teacherId);
		out.println("</p>");
		out.println("<p>");
		out.println("hitting Get method. Thank you");
		out.println("</p>");
		
		Cookie cookie1 = new Cookie("TeacherApp", "H2Kinfosys");
		resp.addCookie(cookie1);
		Cookie cookie2 = new Cookie("Target", "UnitedStates");
		resp.addCookie(cookie2);
		
		out.println("</body></html>");
		
		
	}
	
	// Step 3 - shutdown
	@Override
	public void destroy() {
		System.out.println("TeacherServlet is shutdown");
	}
}
