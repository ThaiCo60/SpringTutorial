package com.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String SayHello(ModelMap model) {
		model.addAttribute("msg", "Hello World");
		return "test";
	}
	
	@RequestMapping(value = "/something", method = RequestMethod.GET)
	public String SaySomething(ModelMap model) {
		model.addAttribute("msg", "Hello Spring");
		return "something";
	}
}
