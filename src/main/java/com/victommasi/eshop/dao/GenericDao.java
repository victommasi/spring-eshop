package com.victommasi.eshop.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GenericDao<T, Type extends Serializable> {

	    List<T> findAll();
		
		T findOne(Type type);
		
		void save(T t);
		
		void delete(Type type);

		void update(T t);

}
