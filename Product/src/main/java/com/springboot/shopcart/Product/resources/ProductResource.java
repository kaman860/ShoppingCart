package com.springboot.shopcart.Product.resources;

import com.springboot.shopcart.Product.clients.WareHouseServiceAdapter;
import com.springboot.shopcart.Product.models.ProductQuantityDTO;
import com.springboot.shopcart.Product.repository.ProductRepository;
import com.springboot.shopcart.Product.repository.model.Product;
import com.springboot.shopcart.Product.service.ProductService;
import com.springboot.shopcart.Product.service.WareHouseService;
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
	public Iterable<Product> getProducts() {
		return productService.getProducts();
	}

	@ApiOperation(value = "Get product detail by ID", tags = "Product Service")
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") long id) {
		return productService.getProduct(id);
	}

	@ApiOperation(value = "Update product quantity ", response = ProductQuantityDTO.class, tags = "Ware House Service")
	@PutMapping("/{id}")
	public ProductQuantityDTO updateProduct(@PathVariable("id") long id, @RequestParam long quantity) {
		return wareHouseService.updateProduct(id, quantity);
	}
}
