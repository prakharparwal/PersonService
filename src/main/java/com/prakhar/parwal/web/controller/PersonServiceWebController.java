package com.prakhar.parwal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonServiceWebController {

	@GetMapping("/")
	public ModelAndView showHomePage() {
		
		ModelAndView homePage = new ModelAndView("home");
		return homePage;
	}
}
