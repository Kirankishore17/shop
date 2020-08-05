package com.foodtruck.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodtruck.shop.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
}
