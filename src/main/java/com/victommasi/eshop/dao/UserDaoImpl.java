package com.victommasi.eshop.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.victommasi.eshop.dao.UserDao;
import com.victommasi.eshop.model.User;

@Repository
public class UserDaoImpl extends GenericJpaDao<User, String> implements UserDao {

	@PersistenceContext
	private EntityManager manager;
	
	public UserDaoImpl() {
	       super(User.class);
	}

}
