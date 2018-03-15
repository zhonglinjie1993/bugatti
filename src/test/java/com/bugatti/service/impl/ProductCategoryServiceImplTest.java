package com.bugatti.service.impl;

import com.bugatti.dataObject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductCategoryServiceImplTest {
    @Autowired
    ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findOne() {
        ProductCategory one = productCategoryService.findOne (2);
        System.out.println (one);
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = productCategoryService.findAll ();
        System.out.println (all);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = new ArrayList<Integer> ();
        list.add (2);
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn (list);
        System.out.println (byCategoryTypeIn);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory ();
        productCategory.setCategoryType (5);
        productCategory.setCategoryName ("玄幻小说");

        productCategoryService.save (productCategory);


    }
}