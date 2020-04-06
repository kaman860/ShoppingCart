package com.shopcart.warehouse.resource;

import com.shopcart.warehouse.repository.model.ProductQuantityDocument;
import com.shopcart.warehouse.service.WarehouseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/quantity")
public class ProductQuantityResource {

	@Autowired
	WarehouseService warehouseService;
	
	@ApiOperation(value = "Get product quantity" , tags = "Ware House Service" , response = ProductQuantityDocument.class)
	@GetMapping("/{id}")
	public ProductQuantityDocument getProductQuantity(@PathVariable("id") long id) {
		return warehouseService.getProductQuantity(id);
	}

	@ApiOperation(value = "Update product quantity ", response = ProductQuantityDocument.class, tags = "Ware House Service")
	@PutMapping("/{id}")
	public ProductQuantityDocument updateQuantity(@RequestBody ProductQuantityDocument productQuantityDocument) {
		return warehouseService.updateQuantity(productQuantityDocument);
	}
}
