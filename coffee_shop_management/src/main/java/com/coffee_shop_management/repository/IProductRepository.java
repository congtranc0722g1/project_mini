package com.coffee_shop_management.repository;

import com.coffee_shop_management.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Query(value = "select * from product where id = :id", nativeQuery = true)
    Product getProduct(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update product set name = :name, price = :price, quantity = :quantity, description = :description, category_id = :categoryId where id = :id", nativeQuery = true)
    void updateProduct(@Param("name") String name, @Param("price") Double price, @Param("quantity") Integer quantity, @Param("description") String description, @Param("categoryId") Integer categoryId, @Param("id") Integer id);

    @Query(value = "select * from product where name like concat('%', :name, '%')", nativeQuery = true)
    Page<Product> findName(@Param("name") String name, Pageable pageable);

    @Query(value = "select * from product where name like concat('%', :name, '%') and category_id = :categoryId", nativeQuery = true)
    Page<Product> findNameAndCategory(@Param("name") String name, @Param("categoryId") Integer categoryId, Pageable pageable);
}
