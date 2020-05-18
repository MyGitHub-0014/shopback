package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.OrdersMapper;
import com.aishang.shopback_1910.po.Adminuser;
import com.aishang.shopback_1910.po.OrdersExt;
import com.aishang.shopback_1910.service.OrdersService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yc950710
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    OrdersMapper ordersMapper;

    /**
     * 查询订单
     * @return
     */
    @Override
    public Map<Integer,List<OrdersExt>> selectOrders() {
        //查询并返回
        List<OrdersExt> selectOrders0 = ordersMapper.selectOrders(0);
        List<OrdersExt> selectOrders1 = ordersMapper.selectOrders(1);
        List<OrdersExt> selectOrders2 = ordersMapper.selectOrders(2);
        List<OrdersExt> selectOrders3 = ordersMapper.selectOrders(3);

        Map<Integer,List<OrdersExt>> map = new HashMap();
        map.put(0,selectOrders0);
        map.put(1,selectOrders1);
        map.put(2,selectOrders2);
        map.put(3,selectOrders3);
        return map;
    }

    /**
     * 发货
     */
    @Override
    public void shipments(Integer oid) {
        ordersMapper.shipments(oid);
    }

    /**
     * 删除
     * @param oid
     */
    @Override
    public void del(Integer oid) {
        ordersMapper.del(oid);
    }

}
