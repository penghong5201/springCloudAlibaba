package com.alibaba.service.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.entity.Order;
import com.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : penghong
 * @date : 2021-05-28 16:32
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
