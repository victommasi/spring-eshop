package com.victommasi.eshop.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.dao.ProductDao;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("product/list");
		mv.addObject("products", productDao.findAll());
		return mv;
	}
	
	@RequestMapping("/{id}")
	public ModelAndView viewProduct(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("product/detail");
		mv.addObject("product", productDao.findOne(id));
		return mv;
	}
	
	@RequestMapping("/image/{id}")
	@ResponseBody
	public byte[] getProductImage(@PathVariable("id") Integer id){
		return productDao.findImage(id);
	}
	
}
