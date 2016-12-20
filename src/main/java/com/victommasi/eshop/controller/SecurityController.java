package com.victommasi.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.model.User;
import com.victommasi.eshop.service.UserService;

@Controller
public class SecurityController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping("/403")
	public String forbidden(){
		return "/error/403";
	}
		
}
