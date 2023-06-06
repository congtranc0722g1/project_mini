package com.coffee_shop_management.repository;

import com.coffee_shop_management.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product", nativeQuery = true)
    Page<Product> getProductList(Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "delete from product where id =:id", nativeQuery = true)
    void deleteProduct(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "insert into product(name, price, quantity, description, category_id) value (:name, :price, :quantity, :description, :categoryId)", nativeQuery = true)
    void addProduct(@Param("name") String name, @Param("price") Double price, @Param("quantity") Integer quantity, @Param("description") String description, @Param("categoryId") Integer categoryId);
}
