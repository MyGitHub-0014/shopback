package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.OrderitemExt;
import com.aishang.shopback_1910.service.OrderitemService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@RestController
@RequestMapping("/orderitem")
public class OrderitemController {
    @Resource
    OrderitemService orderitemService;

    @RequestMapping("/getOds")
    public List<OrderitemExt> getOds(Integer oid){
        System.out.println("-------------------------------------"+oid);
//        根据oid查询订单项包含商品
        List<OrderitemExt> ods = orderitemService.getOds(oid);
        return ods;
    }
}
