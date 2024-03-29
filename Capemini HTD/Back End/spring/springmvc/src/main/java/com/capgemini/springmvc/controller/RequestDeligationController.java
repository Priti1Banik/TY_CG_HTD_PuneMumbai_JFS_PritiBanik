package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {

	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:http://www.facebook.com";
	}
	
	@GetMapping("/forward")
	public String forwardRequest() {
		return "forward:/loginForm";
	}
	
	/*
	 * @GetMapping("/forward") 
	 * public String includeRequest() { 
	 * return"include:/loginForm"; 
	 * }
	 */
}
