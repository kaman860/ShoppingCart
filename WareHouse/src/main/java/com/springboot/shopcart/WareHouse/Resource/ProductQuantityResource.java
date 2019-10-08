package com.springboot.shopcart.WareHouse.Resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopcart.WareHouse.Entities.ProductQuantity;
import com.springboot.shopcart.WareHouse.Helpers.UpdateProductQuantityHelper;
import com.springboot.shopcart.WareHouse.Repository.ProductQuantityRepository;

@RestController
@RequestMapping("/products/quantity")
public class ProductQuantityResource {
	
	@Autowired
	ProductQuantityRepository repository;
	
	@GetMapping("/{id}")
	public long getProductQuantity(@PathVariable("id") long id) {
		Optional<ProductQuantity> productQuantityReponse = repository.findById(id);
		return productQuantityReponse.get().getQuantity();
	}
	
	@PutMapping("/{id}")
	public ProductQuantity updateQuantity(@RequestBody ProductQuantity productQuantity){
		UpdateProductQuantityHelper updateQuantity = new UpdateProductQuantityHelper();
		long availableQuantity = getProductQuantity(productQuantity.getProductId());
		ProductQuantity newProductQuantity = updateQuantity.updateProductQuantity(availableQuantity, productQuantity);
		return repository.save(newProductQuantity);
	}
	
}
