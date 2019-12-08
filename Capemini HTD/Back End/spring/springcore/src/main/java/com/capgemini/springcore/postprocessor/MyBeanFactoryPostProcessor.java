package com.capgemini.springcore.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	
		System.out.println("Inside my bean factory post processor..");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("messageBean2");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		
		//this will allow to show the xml property also which over ridden by propertyValues
		System.out.println("message via xml - " +propertyValues.getPropertyValue("message").getValue());
		
		
		propertyValues.addPropertyValue("message", "Welcome to Spring-5 !!");
	}//end of postProcessBeanFactory()

}//end of class
//this factory class is basically use to make changes in the usual bean container working(like taking value from xml file)