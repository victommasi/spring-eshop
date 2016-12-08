package com.victommasi.eshop.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.dao.ProductDao;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;
	
	@GetMapping("/product")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("product/list");
		mv.addObject("products", productDao.findAll());
		return mv;
	}
	
	@GetMapping("/product/{id}")
	public ModelAndView viewProduct(@PathVariable Integer id) throws IOException{
		ModelAndView mv = new ModelAndView("product/detail");
		mv.addObject("product", productDao.findOne(id));
		return mv;
	}
	
}
