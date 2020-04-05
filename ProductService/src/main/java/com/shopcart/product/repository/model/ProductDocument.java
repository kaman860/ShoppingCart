package com.shopcart.product.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="product")
public class ProductDocument {

	private long productId;
	private String productName;
	private long price;
}
