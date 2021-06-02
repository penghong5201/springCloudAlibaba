package com.stualibaba.dao;

import com.stualibaba.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : penghong
 * @date : 2021-05-28 16:30
 */
public interface OrderDao extends JpaRepository<Order, Integer> {
}
