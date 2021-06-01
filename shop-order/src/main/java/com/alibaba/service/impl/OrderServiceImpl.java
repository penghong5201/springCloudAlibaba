package com.alibaba.service.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.entity.Order;
import com.alibaba.entity.Product;
import com.alibaba.fastjson.JSON;
import com.alibaba.feign.ProductService;
import com.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author : penghong
 * @date : 2021-05-28 16:32
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductService productService;
    @Override
    public Order save(Integer id) {
        Product product = productService.findById(id);
        log.info("商品信息查询结果-->" + JSON.toJSONString(product));
        Order order = new Order();
        order.setUserId(1);
        order.setUserName("测试用户");
        order.setProductId(product.getId());
        order.setProductName(product.getPName());
        order.setNumber(1);
        order.setPrice(product.getPPrice());
        orderDao.save(order);

        return order;
    }
}
