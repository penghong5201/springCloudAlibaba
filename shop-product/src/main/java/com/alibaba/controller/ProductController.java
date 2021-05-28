package com.alibaba.controller;

import com.alibaba.entity.Product;
import com.alibaba.fastjson.JSON;
import com.alibaba.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : penghong
 * @date : 2021-05-28 15:23
 */
@RestController
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id") Integer id){
        Product product = productService.findById(id);
        log.info("查询到的商品信息-->" + JSON.toJSONString(product));
        return product;
    }
}
