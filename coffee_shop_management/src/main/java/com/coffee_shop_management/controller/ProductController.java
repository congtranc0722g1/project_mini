package com.coffee_shop_management.controller;

import com.coffee_shop_management.model.Product;
import com.coffee_shop_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    private ResponseEntity<Page<Product>> showListProduct(@PageableDefault(size = 5) Pageable pageable) {
        Page<Product> productList = productService.getProductList(pageable);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("/delete")
    private ResponseEntity<?> deleteProduct(@RequestParam("id") Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add")
    private ResponseEntity<?> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    private ResponseEntity<?> getProduct(@PathVariable("id") Integer id){
        Product product = productService.getProduct(id);
//        if (product != null){
//            return new ResponseEntity<>(product, HttpStatus.OK);
//        }else {
//            return new ResponseEntity<>("errProduct",HttpStatus.BAD_REQUEST);
//        }

        return new ResponseEntity<>(product, HttpStatus.OK);

    }

    @PostMapping("/update")
    private ResponseEntity<?> updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
