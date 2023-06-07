package com.coffee_shop_management.service;

import com.coffee_shop_management.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductService {
    Page<Product> getProductList(Pageable pageable);

    void deleteProduct(Integer id);

    void addProduct(Product product);

    Product getProduct(Integer id);

    void updateProduct(Product product);

    Page<Product> findName(String name, Pageable pageable);

    Page<Product> findNameAndCategory(String name, Integer categoryId, Pageable pageable);
}
