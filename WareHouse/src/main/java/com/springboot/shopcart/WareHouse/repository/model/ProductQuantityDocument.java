package com.springboot.shopcart.WareHouse.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductQuantityDocument {
	@Id
	private long productId;
	private long quantity;

}
