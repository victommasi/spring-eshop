package com.victommasi.eshop.dao.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.victommasi.eshop.model.Product;
import com.victommasi.eshop.model.util.Category;
import com.victommasi.eshop.model.util.Condition;
import com.victommasi.eshop.model.util.Size;


@Repository
public class ProductDaoAux {

	private List<Product> listProduct;
	
	public List<Product> findAll(){
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Inverse");
		product1.setCategory(Category.CASUAL);
		product1.setCondition(Condition.NEW);
		product1.setDescription("Very nice!");
		product1.setManufacturer("Adidas");
		product1.setPrice(new BigDecimal(150.00));
		product1.setSize(Size.F2);
		product1.setStock(2);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Inverse");
		product2.setCategory(Category.CASUAL);
		product2.setCondition(Condition.NEW);
		product2.setDescription("Very nice!");
		product2.setManufacturer("Adidas");
		product2.setPrice(new BigDecimal(150.00));
		product2.setSize(Size.F2);
		product2.setStock(2);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Inverse");
		product3.setCategory(Category.CASUAL);
		product3.setCondition(Condition.NEW);
		product3.setDescription("Very nice!");
		product3.setManufacturer("Adidas");
		product3.setPrice(new BigDecimal(150.00));
		product3.setSize(Size.F2);
		product3.setStock(2);
		
		listProduct = new ArrayList<Product>();
		listProduct.add(product1);
		listProduct.add(product2);
		listProduct.add(product3);
		
		return listProduct;
	}

	public Product findOne(Integer id) throws IOException {

		for(Product product : findAll()){
			if(product.getId() == id){
				return product;
			}
		}
		
		throw new IOException("No product found");
	}
}
