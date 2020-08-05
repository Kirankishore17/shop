package com.foodtruck.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodtruck.shop.Model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
