package com.h2kinfosys.teachers.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenticationFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AuthenticationFilter init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Step 1 - Pre Processing - Before hitting Servlet
		boolean authentication = false;
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(userName != null && userName.trim().length() > 0  && password != null && password.trim().length() > 0) {
			if(userName.equalsIgnoreCase(password)) {
				authentication = true;
			}
		}
		// Step 2 - Chaining
		if(authentication) {
			chain.doFilter(request, response);
		}else {
			// Step 3 - Post Processing Response is generated 
			PrintWriter out = response.getWriter();
			out.print("User is Not Valid");
		}
		
	}
	
	@Override
	public void destroy() {
		System.out.println("AuthenticationFilter destroy");
	}

}
