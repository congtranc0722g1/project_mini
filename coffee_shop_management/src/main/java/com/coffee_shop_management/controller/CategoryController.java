package com.coffee_shop_management.controller;

import com.coffee_shop_management.model.Category;
import com.coffee_shop_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    private ResponseEntity<List<Category>> showAll(){
        List<Category> categoryList = categoryService.showAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}
