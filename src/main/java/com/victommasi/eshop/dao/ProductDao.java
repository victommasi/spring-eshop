package com.victommasi.eshop.dao;

import java.util.List;
import com.victommasi.eshop.model.Product;


public interface ProductDao {

	List<Product> findAll();
	
	Product findOne(Integer id);
	
	void save(Product product);
	
	void delete(Integer id);
	
}
