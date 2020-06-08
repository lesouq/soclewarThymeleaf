package com.soclewarthymeleaf.soclewarthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AccueilController {
	
	@GetMapping("/")
	public String ToAccueilPage() {
		return "accueil.html";
	}
}
