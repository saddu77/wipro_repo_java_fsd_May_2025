package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.EmployeeService;


public class MainApp {

	public static void main(String[] args) {		
		
		//Spring ApplicationContext Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = ctx.getBean("empService",EmployeeService.class);
		System.out.println("Name: " + empService.getEmployee().getEmp_name());
		
		
	}

}
