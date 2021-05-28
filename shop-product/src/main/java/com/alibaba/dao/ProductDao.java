package com.alibaba.dao;

import com.alibaba.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : penghong
 * @date : 2021-05-28 15:19
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
