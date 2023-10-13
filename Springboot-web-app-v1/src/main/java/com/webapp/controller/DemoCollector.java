package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp.model.User;

@Controller
public class DemoCollector {

	@GetMapping("/form")
	public String showForm(User user) {
		return "form";
	}
	
	@PostMapping("/form")
	public String submitForm(User user, Model model) {
		model.addAttribute("user", user);
		return "result";
	}
}
