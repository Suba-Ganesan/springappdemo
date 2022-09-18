package com.samples.SpringORM.dao;

import java.util.List;

import com.samples.SpringORM.entity.Product;

public interface ProductDAO {

	int create(Product product);

	void update(Product product);

	void delete(Product product);

	Product find(int id);  //read individual

	List<Product> findAll(); //read all

	
}