package com.h2kinfosys.teachers.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLifeCycleListener implements ServletContextListener, ServletContextAttributeListener {

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ContextLifeCycleListener :: contextInitialized ");
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ContextLifeCycleListener :: contextDestroyed ");
	}
	
	
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("ContextLifeCycleListener :: attributeAdded Name " + event.getName() + " Value :: " + event.getValue());
	}
	
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("ContextLifeCycleListener :: attributeReplaced Name " + event.getName() + " Old Value :: " + event.getValue());
	}
	
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("ContextLifeCycleListener :: attributeRemoved Name " + event.getName() + " Value :: " + event.getValue());
	}
}
