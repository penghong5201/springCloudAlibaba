package com.stualibaba.controller;

import com.stualibaba.entity.Order;
import com.stualibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/order/prod/{id}")
    public Order order(@PathVariable("id") Integer id){
        log.info("查询商品信息");
        //从nacos中获取服务地址
//        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("service-product");
//        int index = new Random().nextInt(serviceInstances.size());
//        String url = serviceInstances.get(index).getHost() + ":" + serviceInstances.get(index).getPort();
//        log.info("获取的url-->" + url);
//
//        Product product = restTemplate.getForObject("http://" + url + "/product/" + id, Product.class);

        return orderService.save(id);
    }
}
