package com.victommasi.eshop.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.victommasi.eshop.model.Product;

@Repository
public class ProductDaoImpl extends GenericJpaDao<Product, Integer> implements ProductDao {
	
	@PersistenceContext
	EntityManager manager;

	public ProductDaoImpl() {
	       super(Product.class);
	}
	
	@Override
	public byte[] findImage(Integer id) {
		String jpql = "select p from Product p where p.id = :id";
		Product product = this.manager
				.createQuery(jpql, Product.class)
				.setParameter("id", id)
				.getSingleResult();
		return product.getImage();
	}

}
