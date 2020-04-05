package com.shopcart.product.service;

import com.shopcart.product.clients.WareHouseServiceAdapter;
import com.shopcart.product.models.ProductQuantityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WareHouseService {

    @Autowired
    WareHouseServiceAdapter wareHouseServiceAdapter;

    public ProductQuantityDTO updateProduct(long id, long quantity) {
        return wareHouseServiceAdapter.updateProductQuantity(id, quantity);
    }
}
