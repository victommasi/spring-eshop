package com.victommasi.eshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victommasi.eshop.model.Product;

public interface IProductDao extends JpaRepository<Product, Integer> {

}
