package com.h2kinfosys.teachers.listeners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionBindingListener implements HttpSessionBindingListener {
	
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("SessionBindingListener valueBound " + event.getName() + " Name : " + event.getValue());
		//HttpSession session = event.getSession();
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("SessionBindingListener valueUnbound " + event.getName() + " Name : " + event.getValue());
		//HttpSession session = event.getSession();
	}
}
