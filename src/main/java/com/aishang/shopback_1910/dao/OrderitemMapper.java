package com.aishang.shopback_1910.dao;

import com.aishang.shopback_1910.po.Orderitem;
import com.aishang.shopback_1910.po.OrderitemExt;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;

import java.util.List;
/**
 * @author yc950710
 */
@Mapper
public interface OrderitemMapper extends MyMapper<Orderitem> {
    /**
     * 根据oid查询订单项包含商品
     * @param oid
     * @return
     */
    List<OrderitemExt> getOds(Integer oid);
}