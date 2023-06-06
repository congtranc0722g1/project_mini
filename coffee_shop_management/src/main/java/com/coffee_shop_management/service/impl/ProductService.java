package com.coffee_shop_management.service.impl;

import com.coffee_shop_management.model.Product;
import com.coffee_shop_management.repository.IProductRepository;
import com.coffee_shop_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> getProductList(Pageable pageable) {
        return productRepository.getProductList(pageable);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product.getName(), product.getPrice(), product.getQuantity(),product.getDescription(),product.getCategory().getId());
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.getProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product.getName(), product.getPrice(), product.getQuantity(), product.getDescription(), product.getCategory().getId(), product.getId());
    }
}
