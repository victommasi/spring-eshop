package com.victommasi.eshop.dao;

import org.springframework.stereotype.Repository;

import com.victommasi.eshop.model.Product;

@Repository
public interface ProductDao extends GenericDao<Product, Integer> {

	byte[] findImage(Integer id);

}
