package com.victommasi.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void save(Product product){
		//productDao.save(product);
	}
	
	public void delete(Integer id){
		//productDao.delete(id);
	}
	
}
