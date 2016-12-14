package com.victommasi.eshop.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.victommasi.eshop.service.ImageService;
import com.victommasi.eshop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ImageService imageService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProductController.class);
	
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
		
		if (result.hasErrors() && (result.getErrorCount() > 1  
							   || !result.hasFieldErrors("image"))) {
			logger.info("Returning addProduct.jsp page");
			return addProduct(product);
		}
		
		if (!image.isEmpty()){
			product.setImage(imageService.convert2Byte(image));
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
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView updateProduct(@PathVariable("id") Integer id){
		ModelAndView mv = new ModelAndView("product/editProduct");
		mv.addObject("product", productDao.findOne(id));
		mv.addObject("condition", Condition.values());
		mv.addObject("category", Category.values());
		mv.addObject("size", Size.values());
		return mv;
	}
	
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView updateProduct(@PathVariable("id") Integer id, 
									   @Valid Product product, 
									   BindingResult result, 
									   RedirectAttributes attributes,
									   @RequestParam("image") MultipartFile image) {
		
		if (result.hasErrors() && (result.getErrorCount() > 1  
				   			   || !result.hasFieldErrors("image"))) {
			logger.info("Returning editProduct.jsp page");
			return updateProduct(id);
		}
		
		verifyImageEmpty(image, id, product);
		
		productService.updateProduct(product);
		attributes.addFlashAttribute("message", "Product updated sucessfully!");
		return new ModelAndView("redirect:/admin/inventory");
	}

	private void verifyImageEmpty(MultipartFile image, Integer id, Product product) {
		if(!image.isEmpty()) {
			product.setImage(imageService.convert2Byte(image));
		}
		else {
			product.setImage(productDao.findImage(id));
		}
	}
	
}
