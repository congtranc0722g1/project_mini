package com.coffee_shop_management.controller;

import com.coffee_shop_management.dto.ProductDto;
import com.coffee_shop_management.model.Product;
import com.coffee_shop_management.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    private ResponseEntity<Page<Product>> showListProduct(@RequestParam("nameSearch") String nameSearch, @RequestParam("categoryId") Integer categoryId, @PageableDefault(size = 5) Pageable pageable) {
//        Page<Product> productList = productService.getProductList(pageable);
        Page<Product> productList = null;
        if (categoryId == -1){
            productList = productService.findName(nameSearch, pageable);
        }else {
            productList = productService.findNameAndCategory(nameSearch, categoryId, pageable);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("/delete")
    private ResponseEntity<?> deleteProduct(@RequestParam("id") Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add")
    private ResponseEntity<?> addProduct(@RequestBody @Validated ProductDto productDto, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
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
    private ResponseEntity<?> updateProduct(@RequestBody @Validated ProductDto productDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        productService.updateProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
