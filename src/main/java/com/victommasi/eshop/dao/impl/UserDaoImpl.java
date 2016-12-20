package com.victommasi.eshop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.victommasi.eshop.dao.UserDao;
import com.victommasi.eshop.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<User> findAll() {
		String jpql = "select u from User u";
		return this.manager
				.createQuery(jpql, User.class)
				.getResultList();
	}

	@Override
	public User findUserByName(String username) {
		String jpql = "select u from User u where u.username = :username";
		User user = this.manager
				.createQuery(jpql, User.class)
				.setParameter("username", username)
				.getSingleResult();
		
		return user;
	}

	@Override
	public void save(User user) {
		this.manager.persist(user);
	}

	@Override
	public void delete(String username) {
		this.manager.remove(findUserByName(username));
	}

	@Override
	public void update(User user) {
		this.manager.merge(user);
	}
	
}
