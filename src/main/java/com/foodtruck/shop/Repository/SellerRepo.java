package com.foodtruck.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodtruck.shop.Model.Seller;

public interface SellerRepo extends JpaRepository<Seller, Integer> {

}
