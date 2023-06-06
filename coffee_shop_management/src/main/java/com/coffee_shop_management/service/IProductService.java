package com.coffee_shop_management.service;

import com.coffee_shop_management.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> getProductList(Pageable pageable);

    void deleteProduct(Integer id);

    void addProduct(Product product);
}
