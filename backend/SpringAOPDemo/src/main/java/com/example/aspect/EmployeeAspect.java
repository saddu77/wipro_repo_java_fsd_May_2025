package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	@Before("execution(public String getEmp_name())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.example.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called !!");
	}
}
