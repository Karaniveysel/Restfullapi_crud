package com.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	 Product findByName(String name);

}
