package com.alibaba.controller;

import com.alibaba.entity.Order;
import com.alibaba.entity.Product;
import com.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : penghong
 * @date : 2021-05-28 16:34
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/prod/{id}")
    public Order order(@PathVariable("id") Integer id){
        log.info("查询商品信息");
        Product product = restTemplate.getForObject("localhost:8081/product" + id, Product.class);
        Order order = new Order();
        order.setUserId(1);
        order.setUserName("测试用户");
        order.setProductId(product.getId());
        order.setProductName(product.getPName());
        order.setNumber(1);
        order.setPrice(product.getPPrice());
        orderService.save(order);
        return order;
    }
}
