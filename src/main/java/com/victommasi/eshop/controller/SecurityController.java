package com.victommasi.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.model.User;
import com.victommasi.eshop.service.UserService;

@Controller
public class SecurityController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView loginForm(User user){
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user){
		
		return "redirect:/";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
		
}
