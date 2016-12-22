package com.victommasi.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.model.Product;
import com.victommasi.eshop.service.ProductService;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public void saveProduct(Product product) {
		productDao.save(product);
	}

	public void delete(Integer id) {
		productDao.delete(id);
	}

	public void updateProduct(Product product) {
		productDao.update(product);
	}
	
}
