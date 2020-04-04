package com.springboot.shopcart.Product.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ProductDocument {

	@Id
	private long productId;
	private String productName;
	private long price;
}
