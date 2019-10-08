package com.springboot.shopcart.Product.Resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopcart.Product.Repository.ProductRepository;
import com.springboot.shopcart.Product.Clients.WareHouseServiceAdapter;
import com.springboot.shopcart.Product.Entity.Product;
import com.springboot.shopcart.Product.models.ProductQuantityDTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	ProductRepository repository;
	@Autowired
	WareHouseServiceAdapter wareHouseServiceAdapter;
	
	@ApiOperation(value = "Get list of all products", tags = "Product Service")
	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}

	@ApiOperation(value = "Get product detail by ID", tags = "Product Service")
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") long id) {
		return repository.findById(id);
	}

	@ApiOperation(value = "Update product quantity ", response = ProductQuantityDTO.class, tags = "Ware House Service")
	@PutMapping("/{id}")
	public ProductQuantityDTO updateProduct(@PathVariable("id") long id, @RequestParam long quantity) {
		return wareHouseServiceAdapter.updateProductQuantity(id, quantity);
	}
}
