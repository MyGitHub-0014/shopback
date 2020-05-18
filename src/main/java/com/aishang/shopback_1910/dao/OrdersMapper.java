package com.aishang.shopback_1910.dao;

import com.aishang.shopback_1910.po.Orders;
import com.aishang.shopback_1910.po.OrdersExt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.MyMapper;

import java.util.List;
@Mapper
public interface OrdersMapper extends MyMapper<Orders> {

    /**
     * 查询订单
     * @return
     */
    List<OrdersExt> selectOrders(Integer state);

    /**
     * 发货
     */
    @Update("update orders set state=2 where oid=#{oid}")
    void shipments(Integer oid);

    /**
     * 删除
     * @param oid
     */
    @Update("update orders set state=-1 where oid=#{oid}")
    void del(Integer oid);
}