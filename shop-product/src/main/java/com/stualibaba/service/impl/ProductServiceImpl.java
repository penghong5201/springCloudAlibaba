package com.stualibaba.service.impl;

import com.stualibaba.dao.ProductDao;
import com.stualibaba.entity.Product;
import com.stualibaba.service.ProductService;
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
