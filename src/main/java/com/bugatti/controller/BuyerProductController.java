package com.bugatti.controller;

import com.bugatti.dataObject.ProductCategory;
import com.bugatti.dataObject.ProductInfo;
import com.bugatti.service.ProductCategoryService;
import com.bugatti.service.ProductInfoService;
import com.bugatti.vo.ProductInfoVO;
import com.bugatti.vo.ProductVO;
import com.bugatti.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO list() {
        // 1.查询所有上架的商品

        List<ProductInfo> upAll = productInfoService.findUpAll (0);

        List<Integer> collect = upAll.stream ().map (e -> e.getCategoryType ()).collect (Collectors.toList ());

        // 查询这个类目下的商品
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn (collect);


        ResultVO resultVO = new ResultVO ();
        resultVO.setCode (0);
        resultVO.setMsg ("成功");
        ProductVO productVO = new ProductVO ();

        ProductInfoVO productInfoVO = new ProductInfoVO ();
        productVO.setFoods (Arrays.asList (productInfoVO));
        resultVO.setData (Arrays.asList (productVO));

        return resultVO;

    }


}
