package com.victommasi.eshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victommasi.eshop.model.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {

}
