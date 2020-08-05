package com.foodtruck.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodtruck.shop.Model.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer> {

}
