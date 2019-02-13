package com.ozii.springbootapp.oziiService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
	
	@GetMapping("/home")
	public String login() {
		
		return "/home-page";
	}
	
}
