package com.coffee_shop_management.service.impl;

import com.coffee_shop_management.model.Category;
import com.coffee_shop_management.repository.ICategoryRepository;
import com.coffee_shop_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> showAll() {
        return categoryRepository.showAll();
    }
}
