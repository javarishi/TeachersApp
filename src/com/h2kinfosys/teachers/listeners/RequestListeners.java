package com.h2kinfosys.teachers.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListeners implements ServletRequestListener, ServletRequestAttributeListener {
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestInitialized(sre);
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestDestroyed(sre);
	}
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeAdded(srae);
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeRemoved(srae);
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		ServletRequestAttributeListener.super.attributeReplaced(srae);
	}

}
