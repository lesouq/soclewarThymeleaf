package com.soclewarthymeleaf.soclewarthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String ToLoginpage() {
		return "login.html";
	}
}



