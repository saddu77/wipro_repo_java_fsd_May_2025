package com.example.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	@AfterReturning(pointcut="execution(* getEmp_name())", 
			returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed... Return String="
					+ returnString);
	}
}

