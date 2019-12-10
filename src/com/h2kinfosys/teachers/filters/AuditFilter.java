package com.h2kinfosys.teachers.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuditFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Step 1- Write IP Address of incomeing request
		String ipAddress= request.getRemoteAddr();
		System.out.println("Incoming IP :: " + ipAddress);
		// Step 2 - chain
		chain.doFilter(request, response);

	}

}
