package com.dhanush.moshop.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanush.moshop.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
