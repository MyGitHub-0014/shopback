package com.aishang.shopback_1910.service;

import com.aishang.shopback_1910.po.OrdersExt;

import java.util.List;
import java.util.Map;

public interface OrdersService {

    /**
     * 查询订单
     */
    Map<Integer,List<OrdersExt>> selectOrders();

    /**
     * 发货
     */
    void shipments(Integer oid);

    /**
     * 删除
     * @param oid
     */
    void del(Integer oid);
}
