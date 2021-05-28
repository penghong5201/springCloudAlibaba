package com.alibaba.service.impl;

import com.alibaba.dao.ProductDao;
import com.alibaba.entity.Product;
import com.alibaba.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : penghong
 * @date : 2021-05-28 15:20
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findById(Integer id) {
        return productDao.findById(id).get();
    }
}
