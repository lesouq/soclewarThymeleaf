package com.soclewarthymeleaf.soclewarthymeleaf.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AccueilController {
	
	@GetMapping("/")
	public String ToAccueilPage() {
		return "accueil.html";
	}
}
