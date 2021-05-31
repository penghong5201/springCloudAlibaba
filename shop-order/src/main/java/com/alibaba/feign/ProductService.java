package com.alibaba.feign;

import com.alibaba.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : penghong
 * @date : 2021-05-31 16:09
 */
@FeignClient(value = "service-product")
@Service
public interface ProductService {

    /**获取商品信息
     * @param id
     * @return
     */
    @GetMapping(value = "/product/{id}")
    Product findById(@PathVariable("id") Integer id);

}
