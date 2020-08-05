package com.foodtruck.shop.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sellerId;
	
	@Column(nullable=false)
	private String sellerName;

	private String sellerContact;
	
	@Column(nullable=false)
	private String address;
	
	private String password;
	
	@OneToMany(mappedBy = "sellerId")
	// @JoinColumn(name="sellerId")
	private List<Product> products = new ArrayList<>();

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSellerContact() {
		return sellerContact;
	}

	public void setSellerContact(String sellerContact) {
		this.sellerContact = sellerContact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	
	public void addNewProduct(Product product) {
		this.products.add(product);
	}
	

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerContact=" + sellerContact
				+ ", address=" + address + ", password=" + password + ", products=" + products + "]";
	}
	
	
	
	
}
