package com.bugatti.service.impl;

import com.bugatti.dataObject.ProductCategory;
import com.bugatti.repository.ProductCategoryRepository;
import com.bugatti.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {


    @Autowired
    ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findOne (id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll ();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList) {
        return repository.findByCategoryTypeIn (CategoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save (productCategory);
    }
}
