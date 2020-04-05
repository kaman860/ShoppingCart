package com.shopcart.warehouse.helpers;

import com.shopcart.warehouse.repository.model.ProductQuantityDocument;
import org.springframework.stereotype.Component;

@Component
public class UpdateProductQuantityHelper {

	public ProductQuantityDocument updateProductQuantity(long availableQuantity, ProductQuantityDocument productQuantityDocument) {
		long quantity = productQuantityDocument.getQuantity();
		long id = productQuantityDocument.getProductId();
		long new_quantity = availableQuantity - quantity;
		productQuantityDocument.setProductId(id);
		productQuantityDocument.setQuantity(new_quantity);
		return productQuantityDocument;
	}
}
