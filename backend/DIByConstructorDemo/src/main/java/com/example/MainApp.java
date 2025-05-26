package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {		
		
		//Spring ApplicationContext Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		User userObj = (User) ctx.getBean("userBean");
		System.out.println(userObj);
		
		
	}

}
