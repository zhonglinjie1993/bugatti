package com.bugatti.service.impl;

import com.bugatti.dataObject.ProductInfo;
import com.bugatti.enums.ProductStatusEnums;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    ProductInfoServiceImpl productInfoService;

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo ();
        productInfo.setProductId ("0002");

        productInfo.setProductName ("砍刀");

        productInfo.setProductPrice (new BigDecimal (50));
        productInfo.setProductStock (12);
        productInfo.setProductDescription ("我是一把砍刀");
        productInfo.setProductIcon ("www.sina.com");
        productInfo.setCategoryType (2);
        productInfo.setProductStatus (0);
        productInfoService.save (productInfo);
    }

    @Test
    public void findOne() {
        ProductInfo one = productInfoService.findOne ("0001");
        System.out.println (one);
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest (0, 2);
        Page<ProductInfo> all = productInfoService.findAll (pageRequest);
        System.err.println (all.toString ());
        System.err.println (all.getContent ());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productInfoService.findUpAll (ProductStatusEnums.UP.getCode ());
        System.out.println (upAll);
    }
}