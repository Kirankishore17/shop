package com.foodtruck.shop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodtruck.shop.Model.Orders;
import com.foodtruck.shop.Repository.OrderDetailsRepo;
import com.foodtruck.shop.Repository.OrdersRepo;

@Service
public class OrderService {

	@Autowired
	private OrdersRepo orderRepo;
	
	@Autowired
	private OrderDetailsRepo orderDetailsRepo;
	
	public void newOrder(Orders order) {
		Orders newOrder = orderRepo.save(order);
		System.out.println(newOrder.getOrderDetails());
		//newOrder.getOrderDetails().forEach(item -> System.out.println(item));
	}

}
