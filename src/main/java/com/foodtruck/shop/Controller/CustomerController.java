package com.foodtruck.shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.Customer;
import com.foodtruck.shop.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(path = "newcustomer")
	public String newCustomer(@RequestBody Customer customer) {
		customerService.newCustomer(customer);
		return customer.toString();
	}
}
