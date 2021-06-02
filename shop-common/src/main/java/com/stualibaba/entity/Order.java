package com.stualibaba.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author : penghong
 * @date : 2021-05-28 11:55
 */
@Data
@Entity(name = "shop_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer productId;

    private String productName;

    private BigDecimal price;

    private Integer number;
}
