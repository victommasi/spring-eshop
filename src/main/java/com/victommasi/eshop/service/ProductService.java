package com.victommasi.eshop.service;

import com.victommasi.eshop.model.Product;

public interface ProductService {
	
	void saveProduct(Product product);
	
	void delete(Integer id);

	void updateProduct(Product product);
	
}
