package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.MessageBean;
import com.capgemini.springcore.annotations.config.MessageConfig;

public class MessageTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean1 = context.getBean(MessageBean.class);
		System.out.println("Message 1 = " +messageBean1.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println("Message 2 = " +messageBean2.getMessage());
		
		messageBean2.setMessage("Its New Message for Bean 2");
		System.out.println("Message 1 = " +messageBean1.getMessage());
		System.out.println("Message 2 = " +messageBean2.getMessage());
		
	
	}
}
