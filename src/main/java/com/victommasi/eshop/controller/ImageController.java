package com.victommasi.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.service.ImageService;

@Controller
public class ImageController {
	
	@Autowired
	ImageService imageService;

	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/product/image/{id}")
	@ResponseBody
	public byte[] getProductImage(@PathVariable("id") Integer id){
		 //String base64Encoded = imageService.convert2String(id);
		//return base64Encoded;
		return productDao.findImage(id);
	}
}
