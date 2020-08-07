package com.foodtruck.shop.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodtruck.shop.Dto.OrderDto;
import com.foodtruck.shop.Model.Orders;
import com.foodtruck.shop.Repository.OrderDetailsRepo;
import com.foodtruck.shop.Repository.OrdersRepo;
import com.foodtruck.shop.Repository.ProductRepo;

@Service
public class OrderService {

	@Autowired
	private OrdersRepo orderRepo;
	
	@Autowired
	private OrderDetailsRepo orderDetailsRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	public void newOrder(Orders order) {
		Orders newOrder = orderRepo.save(order);
		System.out.println(newOrder.getOrderDetails());
	}

	public List<OrderDto> allOrders(Integer id) {
		List<Orders> list = orderRepo.findAllById(Arrays.asList(id));
		OrderDto dto = new OrderDto();
		List<OrderDto> info = new ArrayList<OrderDto>();
		list.forEach(order -> {
			dto.setCustomerId(order.getCustomerId());
			dto.setOrderId(order.getOrderId());
			dto.setTotalAmount(order.getTotalAmount());
			dto.setOrderDate(order.getOrderDate());
			dto.setDeliveryDate(order.getDeliveryDate());
			order.getOrderDetails().forEach(product -> dto.getProducts().add(productRepo.getOne(product.getProductId())));
			order.getOrderDetails().forEach(qty -> dto.getQty().add(qty.getQty()));
			info.add(dto);
		});
		return info;
	}

}
