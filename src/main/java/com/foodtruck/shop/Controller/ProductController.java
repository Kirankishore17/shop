package com.foodtruck.shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.Product;
import com.foodtruck.shop.Service.ProductService;

// @RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	// @RequestMapping
	public String addNewProduct() {
		Product p = new Product();
		p.setCategory("mobile");
		p.setImagePath("pathk");
		p.setPrice(112.0);
		p.setProductDescription("working");
		p.setProductName("vivo");
		p.setStock(1000);
		p.setSellerId(1);
		productService.addNewProduct(p);
		return p.toString();
	}
}
