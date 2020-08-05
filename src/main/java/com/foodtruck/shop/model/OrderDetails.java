package com.foodtruck.shop.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {

	
//	private Integer orderId;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Integer productDetailId;

	private Integer qty;
	
	@OneToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	// @ManyToOne
	// @JoinColumn(name="orderId")
	// private Integer order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

//	public Integer getOrder() {
//		return order;
//	}
//
//	public void setOrder(Integer order) {
//		this.order = order;
//	}

	

	public Integer getProductDetailId() {
		return productDetailId;
	}

//	public Integer getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}

	public void setProductDetailId(Integer productDetailId) {
		this.productDetailId = productDetailId;
	}
	

	@Override
	public String toString() {
		return "OrderDetails [productId=" + productDetailId + ", id=" + id + ", qty=" + qty + ", product=" + product + "]";
	}
	
	
	
}
