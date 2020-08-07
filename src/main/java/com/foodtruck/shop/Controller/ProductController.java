package com.foodtruck.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.Product;
import com.foodtruck.shop.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(path = "newproduct")
	public void addNewProduct(@RequestBody Product product) {
//		Product p = new Product();
//		p.setCategory("mobile");
//		p.setImagePath("pathk");
//		p.setPrice(112.0);
//		p.setProductDescription("working");
//		p.setProductName("vivo");
//		p.setStock(1000);
//		p.setSellerId(1);
		productService.addNewProduct(product);
	}
	
	@RequestMapping(path = "/allproducts")
	public List<Product> allProducts() {
		
		return productService.allProducts();
		
	}
}


