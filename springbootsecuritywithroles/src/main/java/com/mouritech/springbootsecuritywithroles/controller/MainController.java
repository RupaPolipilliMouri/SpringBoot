package com.mouritech.springbootsecuritywithroles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/Customer")
	public String Supplier()
	{
	  return "<h2>Welcome to Customer Page!!!!!!!</h2>";
	}
	  
	 @GetMapping("/User") 
	public String User() {
		 return "<h2>Welcome to User Page!!!!!!</h2>";
	 }
	 
	 
	 @GetMapping("/Home")
	public String Home() {
		 return "<h2>Welcome to Home Page</h2>";
	 }
	
	
	
	
}
