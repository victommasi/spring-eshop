package com.victommasi.eshop.dao;

import org.springframework.stereotype.Repository;
import com.victommasi.eshop.model.User;

@Repository
public interface UserDao extends GenericDao<User, String>{
	
}
