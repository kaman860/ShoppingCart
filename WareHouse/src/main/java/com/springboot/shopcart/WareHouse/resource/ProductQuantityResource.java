package com.springboot.shopcart.WareHouse.resource;

import com.springboot.shopcart.WareHouse.repository.model.ProductQuantityDocument;
import com.springboot.shopcart.WareHouse.service.WareHouseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/quantity")
public class ProductQuantityResource {

	@Autowired
	WareHouseService wareHouseService;
	
	@ApiOperation(value = "Get product quantity" , tags = "Ware House Service")
	@GetMapping("/{id}")
	public long getProductQuantity(@PathVariable("id") long id) {
		return wareHouseService.getProductQuantity(id);
	}

	@ApiOperation(value = "Update product quantity ", response = ProductQuantityDocument.class, tags = "Ware House Service")
	@PutMapping("/{id}")
	public ProductQuantityDocument updateQuantity(@RequestBody ProductQuantityDocument productQuantityDocument) {
		return wareHouseService.updateQuantity(productQuantityDocument);
	}
}
