package com.foodtruck.shop.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.OrderDetails;
import com.foodtruck.shop.Model.Orders;
import com.foodtruck.shop.Repository.OrderDetailsRepo;
import com.foodtruck.shop.Repository.OrdersRepo;
import com.foodtruck.shop.Repository.ProductRepo;

@RestController
public class OrderController {

	@Autowired
	private OrdersRepo orderRepo;
	
	@Autowired
	private OrderDetailsRepo orderDetailsRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@RequestMapping
	public void newOrder() {
		Orders o = new Orders();
		o.setCustomerId(2);
		o.setDeliveryDate(new Date());
		o.setOrderDate(new Date());
		o.setTotalAmount(30.0);
		List<OrderDetails> l = new ArrayList<>();
		o.setOrderDetails(l);
		OrderDetails d = new OrderDetails();		
		d.setProductDetailId(5);
		d.setQty(1);
		d.setProduct(productRepo.getOne(5));
		OrderDetails od = orderDetailsRepo.save(d);
		
		o.getOrderDetails().add(od);
		OrderDetails dd = new OrderDetails();		
		dd.setProductDetailId(4);
		dd.setQty(12);
		dd.setProduct(productRepo.getOne(4));
		OrderDetails ood = orderDetailsRepo.save(dd);
		
		o.getOrderDetails().add(ood);
		
		orderRepo.save(o);
		orderRepo.findAll().forEach(k -> System.out.println(k + "\n----> " +k.getOrderDetails()));
		System.out.println(orderDetailsRepo.getOne(2).getProduct());
	}
}
