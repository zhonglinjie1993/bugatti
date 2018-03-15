package com.bugatti.repository;

import com.bugatti.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {


    /**
     * 根据商品的状态来查询
     *
     * @param status
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer status);
}
