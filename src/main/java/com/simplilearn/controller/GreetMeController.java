package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMeController {

	// STEP 1: Handles request
	@GetMapping("/greet/me")
	public String greetMe(Model model, @RequestParam(name="name", required = false, defaultValue = "World!") String name) {
	
		// STEP 2: Do business logic
		
		// STEP 3: Populate Model
		model.addAttribute("name", 	name);
		
		// STEP 4: Invoke view
		return "hello";
	}
	
	// hello.html
}
