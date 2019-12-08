package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

		public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized");
	}
		public void destroy() throws Exception {
			System.out.println("Destroyed");
		}
	
}// end of class
