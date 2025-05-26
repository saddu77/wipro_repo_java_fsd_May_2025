package com.example;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		
			
		//		Spring ApplicationContext Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		User userObj = (User) ctx.getBean("userBean");
		System.out.println(userObj.getUsername() + " " + userObj.getPassword());
		
		Product productObj = (Product)ctx.getBean("productBean");
		System.out.println(productObj.getP_id() + " " + productObj.getP_name());
	}

}
