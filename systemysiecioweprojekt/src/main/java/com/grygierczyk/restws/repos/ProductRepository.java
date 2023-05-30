package com.grygierczyk.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grygierczyk.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
