package com.victommasi.eshop.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.model.Product;
import com.victommasi.eshop.model.util.Category;
import com.victommasi.eshop.model.util.Condition;
import com.victommasi.eshop.model.util.Size;

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
	public ModelAndView viewProduct(@PathVariable Integer id) throws IOException{
		ModelAndView mv = new ModelAndView("product/detail");
		mv.addObject("product", productDao.findOne(id));
		System.out.println(productDao.findOne(id));
		return mv;
	}
	
	@RequestMapping("/addProduct")
	public ModelAndView addProduct(Product product){
		ModelAndView mv = new ModelAndView("product/add");
		mv.addObject("product", product);
		//mv.addObject("condition", Condition.values());
		//mv.addObject("category", Category.values());
		//mv.addObject("size", Size.values());
		return mv;
	}
	
	/*
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView createCustomer(@Valid Customer customer, 
									   BindingResult result, 
									   RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return createCustomer(customer);
		}
		
		customerService.saveCustomer(customer);
		attributes.addFlashAttribute("message", "Cliente salvo com sucesso!");
		return new ModelAndView("redirect:/customer/new");
	}
	*/
	
}
