package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "Home.jsp";
	}
}
