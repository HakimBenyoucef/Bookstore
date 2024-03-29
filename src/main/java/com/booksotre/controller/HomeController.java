package com.booksotre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("classActiveLogin", true);
		return "myAccount";
	}
	
	@GetMapping("/forgetPassword")
	public String forgetPassword(Model model)
	{
		model.addAttribute("classActiveForgetPassword", true);
		return "myAccount";
	}
	
	@GetMapping("/newUser")
	public String newUser(Model model)
	{
		model.addAttribute("classActiveAccount", true);
		return "myAccount";
	}

}
