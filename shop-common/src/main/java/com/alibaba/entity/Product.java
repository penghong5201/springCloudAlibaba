package com.alibaba.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : penghong
 * @date : 2021-05-28 11:53
 */
@Data
@Entity(name = "shop_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pName;

    private BigDecimal pPrice;

    private Integer stock;
}
