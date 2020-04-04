package com.springboot.shopcart.WareHouse.service;

import com.springboot.shopcart.WareHouse.repository.model.ProductQuantityDocument;
import com.springboot.shopcart.WareHouse.helpers.UpdateProductQuantityHelper;
import com.springboot.shopcart.WareHouse.repository.ProductQuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WareHouseService {

    @Autowired
    ProductQuantityRepository repository;
    @Autowired
    UpdateProductQuantityHelper updateProductQuantityHelper;

    public long getProductQuantity(long id) {
        Optional<ProductQuantityDocument> productQuantityReponse = repository.findById(id);
        return productQuantityReponse.isPresent()
                ? productQuantityReponse.get().getQuantity()
                : null;
    }

    public ProductQuantityDocument updateQuantity(ProductQuantityDocument productQuantityDocument) {
        long availableQuantity = getProductQuantity(productQuantityDocument.getProductId());
        ProductQuantityDocument newProductQuantityDocument = updateProductQuantityHelper.updateProductQuantity(availableQuantity, productQuantityDocument);
        return repository.save(newProductQuantityDocument);
    }
}
