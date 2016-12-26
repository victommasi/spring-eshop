package com.victommasi.eshop.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.victommasi.eshop.model.Cart;
import com.victommasi.eshop.model.Customer;
import com.victommasi.eshop.model.User;
import com.victommasi.eshop.model.UserRole;

@Repository
public class CustomerDaoImpl extends GenericJpaDao<Customer, Integer> implements CustomerDao{

	@PersistenceContext
	EntityManager manager;
	
	public CustomerDaoImpl() {
	       super(Customer.class);
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		manager.persist(customer);
		manager.persist(customer.getAddress());
		
		User user = new User();
		user.setUsername(customer.getUsername());
		user.setPassword(customer.getPassword());
		user.setEnabled(true);
		user.setCustomerId(customer.getId());
		
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole("ROLE_USER");
		manager.persist(user);
		manager.persist(userRole);
		
		Cart cart = new Cart();
		cart.setCustomer(customer);
		customer.setCart(cart);
		manager.merge(customer);
		manager.persist(cart);

		manager.flush();
	}
}
