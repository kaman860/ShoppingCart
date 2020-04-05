package com.shopcart.product.resources;

import com.shopcart.product.repository.ProductRepository;
import com.shopcart.product.repository.model.ProductDocument;
import com.shopcart.product.clients.WareHouseServiceAdapter;
import com.shopcart.product.models.ProductQuantityDTO;
import com.shopcart.product.service.ProductService;
import com.shopcart.product.service.WareHouseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	ProductRepository repository;
	@Autowired
	WareHouseServiceAdapter wareHouseServiceAdapter;
	@Autowired
	ProductService productService;
	@Autowired
	WareHouseService wareHouseService;
	
	@ApiOperation(value = "Get list of all products", tags = "Product Service")
	@GetMapping
	public Iterable<ProductDocument> getProducts() {
		return productService.getProducts();
	}

	@ApiOperation(value = "Get product detail by ID", tags = "Product Service")
	@GetMapping("/{id}")
	public Optional<ProductDocument> getProduct(@PathVariable("id") long id) {
		return productService.getProduct(id);
	}

	@ApiOperation(value = "Update product quantity ", response = ProductQuantityDTO.class, tags = "Ware House Service")
	@PutMapping("/{id}")
	public ProductQuantityDTO updateProduct(@PathVariable("id") long id, @RequestParam long quantity) {
		return wareHouseService.updateProduct(id, quantity);
	}
}
