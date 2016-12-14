package com.victommasi.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.model.Product;
import com.victommasi.eshop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public void saveProduct(Product product) {
		productDao.save(product);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.update(product);
	}
	
}
