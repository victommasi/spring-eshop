package com.victommasi.eshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victommasi.eshop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
