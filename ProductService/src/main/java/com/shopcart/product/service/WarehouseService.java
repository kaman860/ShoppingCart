package com.shopcart.product.service;

import com.shopcart.product.clients.WarehouseServiceAdapter;
import com.shopcart.product.models.ProductQuantityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {

    @Autowired
    WarehouseServiceAdapter warehouseServiceAdapter;

    public ProductQuantityDTO updateProduct(long id, long quantity) {
        return warehouseServiceAdapter.updateProductQuantity(id, quantity);
    }
}
