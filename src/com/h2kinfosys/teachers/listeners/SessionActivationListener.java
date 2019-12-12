package com.h2kinfosys.teachers.listeners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class SessionActivationListener implements HttpSessionActivationListener {

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("sessionWillPassivate :: Go ahead and save details in DB");
	}
	
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("sessionDidActivate :: Go ahead and retireve details from DB");
	}
	
	
}
