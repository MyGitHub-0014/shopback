package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.OrderitemMapper;
import com.aishang.shopback_1910.po.OrderitemExt;
import com.aishang.shopback_1910.service.OrderitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@Service
public class OrderitemServiceImpl implements OrderitemService {
    @Resource
    OrderitemMapper orderitemMapper;
    /**
     * 根据oid查询订单项包含商品
     * @param oid
     * @return
     */
    @Override
    public List<OrderitemExt> getOds(Integer oid) {
        return orderitemMapper.getOds(oid);
    }
}
