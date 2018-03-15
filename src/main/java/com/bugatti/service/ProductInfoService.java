package com.bugatti.service;

import com.bugatti.dataObject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    ProductInfo save(ProductInfo productInfo);


    ProductInfo findOne(String productId);


    Page<ProductInfo> findAll(Pageable pageable);


    List<ProductInfo> findUpAll(Integer productStatus);
    // 加库存
    // 减库存

}
