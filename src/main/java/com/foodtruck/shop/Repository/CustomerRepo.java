package com.foodtruck.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodtruck.shop.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
