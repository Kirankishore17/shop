package com.foodtruck.shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.shop.Model.Seller;
import com.foodtruck.shop.Service.SellerService;

@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(path = "newseller")
	public void newSeller(@RequestBody Seller seller) {
		sellerService.newSeller(seller);
	}
}
