package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
	MobileBean mobile = context.getBean("mobile", MobileBean.class);
	
	System.out.println("Mobile brand is : " +mobile.getBrandName());
	System.out.println("Model name is : " +mobile.getModelName());
	System.out.println("Price is : " +mobile.getPrice());
	System.out.println("Screen size is = " +mobile.getMobDisplay().getDisplaySize());
	System.out.println("Resolution is : " +mobile.getMobDisplay().getResolution());
}
}

