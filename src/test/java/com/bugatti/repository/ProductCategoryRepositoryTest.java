package com.bugatti.repository;

import com.bugatti.dataObject.ProductCategory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findAll() {
        List<ProductCategory> all = repository.findAll ();
        System.out.println (all);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory ();
        productCategory.setCategoryName ("男生最爱");
        productCategory.setCategoryType (2);
        repository.save (productCategory);

    }

    @Test
    public void update() {
        ProductCategory productCategory = new ProductCategory ();
        productCategory.setCategoryId (2);
        productCategory.setCategoryName ("女生最爱");
        productCategory.setCategoryType (2);
        repository.save (productCategory);

    }

    @Test
    public void findOne() {
        ProductCategory productCategory = repository.findOne (1);
        System.out.println (productCategory);

    }

    @Test
    public void updateDate() {
        ProductCategory productCategory = repository.findOne (1);
        productCategory.setCategoryId (2);
        productCategory.setCategoryType (8);
        repository.save (productCategory);

    }

    @Test
    public void findByCategoryType() {
        List<Integer> list = new ArrayList<Integer> ();
        list.add (2);
        List<ProductCategory> byCategoryType = repository.findByCategoryTypeIn (list);
        System.out.println (byCategoryType);

    }


}