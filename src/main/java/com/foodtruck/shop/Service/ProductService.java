package com.foodtruck.shop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodtruck.shop.Model.Product;
import com.foodtruck.shop.Model.Seller;
import com.foodtruck.shop.Repository.ProductRepo;
import com.foodtruck.shop.Repository.SellerRepo;

@Service
public class ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private SellerRepo sellerRepo;
	
	public void addNewProduct(Product product) {
		Product newProduct = productRepo.save(product);
		int id = newProduct.getSellerId();
		System.out.println(sellerRepo.getOne(id).getProducts().size());
		Seller s = sellerRepo.getOne(id);
		s.addNewProduct(newProduct);
		sellerRepo.save(s);
		System.out.println(sellerRepo.getOne(id).getProducts().size());
		System.out.println(newProduct);
	}	
}
