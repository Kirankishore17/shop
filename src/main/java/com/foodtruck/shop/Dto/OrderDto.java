package com.foodtruck.shop.Dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.foodtruck.shop.Model.Product;


public class OrderDto {

	private Integer orderId;	
	private Integer customerId;
	private Date orderDate;
	private Date deliveryDate;
	private Double totalAmount;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Product> products = new ArrayList<Product>();
	private List<Integer> qty = new ArrayList<>();
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Integer> getQty() {
		return qty;
	}
	public void setQty(List<Integer> qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", totalAmount=" + totalAmount + ", products=" + products
				+ ", qty=" + qty + "]";
	}
	
	

}
