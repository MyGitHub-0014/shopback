package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.Adminuser;
import com.aishang.shopback_1910.po.OrderitemExt;
import com.aishang.shopback_1910.po.OrdersExt;
import com.aishang.shopback_1910.service.OrdersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yc950710
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    OrdersService ordersService;
    /**
     * 查询订单
     * @return
     */
    @RequestMapping("/selectOrders")
    public Map<Integer,List<OrdersExt>> selectOrders(){
        Map<Integer, List<OrdersExt>> integerListMap = ordersService.selectOrders();
        return integerListMap;
    }

    /**
     * 发货
     * @return
     */
    @RequestMapping("/shipments")
    public String shipments(Integer oid){
        ordersService.shipments(oid);

        return "";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("/del")
    public String del(Integer oid){
        ordersService.del(oid);

        return "";
    }
}
