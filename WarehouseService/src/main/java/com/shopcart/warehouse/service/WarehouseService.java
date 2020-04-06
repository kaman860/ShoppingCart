package com.shopcart.warehouse.service;

import com.shopcart.warehouse.helpers.UpdateProductQuantityHelper;
import com.shopcart.warehouse.repository.ProductQuantityRepository;
import com.shopcart.warehouse.repository.model.ProductQuantityDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class WarehouseService {

    @Autowired
    ProductQuantityRepository repository;
    @Autowired
    UpdateProductQuantityHelper updateProductQuantityHelper;

    public ProductQuantityDocument getProductQuantity(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.valueOf(id)));
    }

    public ProductQuantityDocument updateQuantity(ProductQuantityDocument productQuantityDocument) {
        long productId = productQuantityDocument.getProductId();
        ProductQuantityDocument document = repository.findById(productId)
                .orElseThrow(() -> new NoSuchElementException(String.valueOf(productId)));
        long availableQuantity = document.getQuantity();
        ProductQuantityDocument newProductQuantityDocument = updateProductQuantityHelper.updateProductQuantity(availableQuantity, productQuantityDocument);
        return repository.save(newProductQuantityDocument);
    }
}
