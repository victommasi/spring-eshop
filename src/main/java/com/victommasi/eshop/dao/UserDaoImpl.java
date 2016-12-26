package com.victommasi.eshop.dao;


import org.springframework.stereotype.Repository;

import com.victommasi.eshop.dao.UserDao;
import com.victommasi.eshop.model.User;

@Repository
public class UserDaoImpl extends GenericJpaDao<User, String> implements UserDao {

	public UserDaoImpl() {
	       super(User.class);
	}

}
