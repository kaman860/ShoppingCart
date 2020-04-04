package com.springboot.shopcart.Product.service;

import com.springboot.shopcart.Product.clients.WareHouseServiceAdapter;
import com.springboot.shopcart.Product.models.ProductQuantityDTO;
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
