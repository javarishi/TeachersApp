package com.h2kinfosys.teachers.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(); // gives or creates a new session
		session.setAttribute("SessionAttrName", "SessionAttrValue");
		session.setMaxInactiveInterval(15);
		
		
		req.setAttribute("RequestAttrName", "RequestAttrValue");
		
		ServletContext context = getServletContext();
		context.setAttribute("ContextAttrName", "ContextAttrValue");
		context.setAttribute("ContextAttrToBeRemoved", "ContextAttrNewValue");
		context.setAttribute("ContextAttrName", "ContextAttrNewValue");
		context.removeAttribute("ContextAttrToBeRemoved");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<p>" + req.getAttribute("RequestAttrName") + "</p>" );
		if(session != null) {
			out.println("<p> session.getCreationTime() :: " + session.getCreationTime() + "</p>" );
			out.println("<p>session.getMaxInactiveInterval() " + session.getMaxInactiveInterval() + "</p>" );
			out.println("<p>" + session.getAttribute("SessionAttrName") + "</p>" );
		}
		out.println("<p>" + getServletContext().getAttribute("ContextAttrName") + "</p>" );
		
		out.println("</body></html>");
		
		
	}

}
