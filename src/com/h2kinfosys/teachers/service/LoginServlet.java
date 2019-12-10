package com.h2kinfosys.teachers.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//	RequestDispatcher rd = req.getRequestDispatcher("Teacher.html");
		
		ServletConfig config = getServletConfig();
		String applicationName = config.getInitParameter("ApplicationName");
		System.out.println("Loading application :: " + applicationName);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Teacher.html");
		rd.forward(req, resp);
	}

}
