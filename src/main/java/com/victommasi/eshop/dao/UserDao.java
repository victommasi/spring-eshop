package com.victommasi.eshop.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.victommasi.eshop.model.User;

@Repository
public interface UserDao {
	
    List<User> findAll();
	
	User findUserByName(String username);
	
	void save(User user);
	
	void delete(String username);

	void update(User user);

}
