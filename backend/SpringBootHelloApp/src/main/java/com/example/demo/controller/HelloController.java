package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hello(){
		return "<h2> Hello World from Spring Application</h2>";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "<h2> Welcome to My First Spring Application</h2>";
	}
	
}
