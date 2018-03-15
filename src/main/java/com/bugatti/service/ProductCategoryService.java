package com.bugatti.service;

import com.bugatti.dataObject.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();


    List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);


    ProductCategory save(ProductCategory productCategory);

}
