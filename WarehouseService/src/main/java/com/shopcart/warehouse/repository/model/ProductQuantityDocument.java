package com.shopcart.warehouse.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "warehouseInfo")
public class ProductQuantityDocument {
	@Id
	private long productId;

	private long quantity;

}
