package com.foodtruck.shop.Service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.Customer;
import com.foodtruck.shop.Model.Product;
import com.foodtruck.shop.Model.Seller;
import com.foodtruck.shop.Repository.CustomerRepo;
import com.foodtruck.shop.Repository.SellerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private SellerRepo sell;
	
	@RequestMapping
	public void home() {
		Customer x = new Customer();
		x.setAddress("dddd");
		x.setCity("lksjdmck");
		x.setContact("11111112");
		x.setEmail("gmail");
		x.setFirstName("kk");
		x.setLastName("k");
		x.setPassword("pksw");
		x.setRegisteredDate(new Date());
		x.setState("tn");
		x.setUpdatedDate(new Date());
		repo.save(x);
		System.out.println(repo.getOne(2));
		
		Seller s = new Seller();
		s.setAddress("ad");
		s.setPassword("p");
		s.setSellerContact("c");
		s.setSellerName("name");
		Product p = new Product();
		p.setCategory("cat");
		p.setImagePath("path");
		p.setPrice(2.0);
		p.setProductDescription("desc ");
		p.setProductName("namep");
		p.setStock(10);
		s.setProducts(Arrays.asList(p));
		sell.save(s);
		System.out.print(s);
		
	}
}
