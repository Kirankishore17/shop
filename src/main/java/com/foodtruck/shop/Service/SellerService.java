package com.foodtruck.shop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodtruck.shop.Model.Seller;
import com.foodtruck.shop.Repository.SellerRepo;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepo sellerRepo;

	public void newSeller(Seller seller) {
		sellerRepo.save(seller);
	}

}
