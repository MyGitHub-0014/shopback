package com.aishang.shopback_1910.service;

import com.aishang.shopback_1910.po.OrderitemExt;

import java.util.List;

/**
 * @author yc950710
 */
public interface OrderitemService {
    /**
     * 根据oid查询订单项包含商品
     * @param oid
     * @return
     */
    List<OrderitemExt> getOds(Integer oid);
}
