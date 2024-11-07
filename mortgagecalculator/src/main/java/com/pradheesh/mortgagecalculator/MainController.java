package com.pradheesh.mortgagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/index")
	public String showForm(Model model) {
		model.addAttribute("interest", new Interest());
		return "index";
	}
	
	@PostMapping("/result")
	public String calculateInterest(@ModelAttribute Interest interest , Model model) {
		model.addAttribute("interest", interest);
		return "result";
	}
}
