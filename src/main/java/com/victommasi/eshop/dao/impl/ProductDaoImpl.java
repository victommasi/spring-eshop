package com.victommasi.eshop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.exception.ProductDoesnotExistsException;
import com.victommasi.eshop.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public List<Product> findAll() {
		String jpql = "select p from Product p";
		return this.manager
				.createQuery(jpql, Product.class)
				.getResultList();
	}

	@Override
	public Product findOne(Integer id) {
		String jpql = "select p from Product p where p.id = :id";
		List<Product> productList = this.manager
				.createQuery(jpql, Product.class)
				.setParameter("id", id)
				.getResultList();
		
			if(productList.isEmpty()){
				throw new ProductDoesnotExistsException("Product doesnt exists.");
			}
			
		Product product = productList.get(0);
		return product;
	}

	@Override
	public void save(Product product) {
		this.manager.persist(product);
	}

	@Override
	public void delete(Integer id) {
		this.manager.remove(findOne(id));
	}

}
