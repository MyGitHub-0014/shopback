package com.aishang.shopback_1910.po;

import java.util.List;

/**
 * 订单拓展类
 * @author yc950710
 */
public class OrdersExt extends Orders {
    private List<OrderitemExt> orderItemExts;

    public List<OrderitemExt> getOrderItemExts() {
        return orderItemExts;
    }

    public void setOrderItemExts(List<OrderitemExt> orderItemExts) {
        this.orderItemExts = orderItemExts;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "orderItemExts=" + orderItemExts +
                '}';
    }
}
