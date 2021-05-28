package com.alibaba.service;

import com.alibaba.entity.Product;

/**
 * @author : penghong
 * @date : 2021-05-28 15:20
 */
public interface ProductService {
    Product findById(Integer id);
}
