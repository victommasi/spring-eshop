package com.victommasi.eshop.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.model.Product;
import com.victommasi.eshop.model.util.Category;
import com.victommasi.eshop.model.util.Condition;
import com.victommasi.eshop.model.util.Size;
import com.victommasi.eshop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductService productService;
	
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
	
	@RequestMapping("/new")
	public ModelAndView addProduct(Product product){
		ModelAndView mv = new ModelAndView("product/addProduct");
		mv.addObject("product", product);
		mv.addObject("condition", Condition.values());
		mv.addObject("category", Category.values());
		mv.addObject("size", Size.values());
		return mv;
	}
	
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView addProduct(@RequestParam("image") MultipartFile image,
								   @Valid Product product, 
								   BindingResult result,
								   RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return addProduct(product);
		}
		
		productService.saveProduct(product);
		attributes.addFlashAttribute("message", "Product created sucessfully!");
		return new ModelAndView("redirect:/product/new");
	}
	
	
	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deleteProduct(@PathVariable Integer id) {
		productService.delete(id);
		return new ModelAndView("redirect:/admin/inventory");
	}
	
	/*
	@RequestMapping("/edit/{id}")
	public ModelAndView updateProduct(@PathVariable("id") Product product){
		ModelAndView mv = new ModelAndView("product/addProduct");
		mv.addObject("product", product);
		mv.addObject("condition", Condition.values());
		mv.addObject("category", Category.values());
		mv.addObject("size", Size.values());
		return mv;
	}
	
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
	public ModelAndView updateProduct(@PathVariable Integer id, 
									   @Valid Product product, 
									   BindingResult result, 
									   RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return updateProduct(product);
		}
		
		//productService.saveCustomer(product);
		attributes.addFlashAttribute("message", "Product updated sucessfully!");
		return new ModelAndView("redirect:/admin/inventory");
	}
	*/
	
}
