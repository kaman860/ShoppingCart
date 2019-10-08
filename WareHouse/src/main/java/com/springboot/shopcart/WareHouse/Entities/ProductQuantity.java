package com.springboot.shopcart.WareHouse.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductQuantity {
	@Id
	private long productId;
	private long quantity;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
