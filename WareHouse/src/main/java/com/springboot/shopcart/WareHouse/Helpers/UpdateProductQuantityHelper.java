package com.springboot.shopcart.WareHouse.Helpers;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.shopcart.WareHouse.Entities.ProductQuantity;

public class UpdateProductQuantityHelper {

	public ProductQuantity updateProductQuantity(long availableQuantity, ProductQuantity productQuantity) {
		long quantity = productQuantity.getQuantity();
		long id = productQuantity.getProductId();
		long new_quantity = availableQuantity - quantity;
		productQuantity.setProductId(id);
		productQuantity.setQuantity(new_quantity);
		return productQuantity;
	}
}
