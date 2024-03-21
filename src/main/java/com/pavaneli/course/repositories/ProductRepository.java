package com.pavaneli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavaneli.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
