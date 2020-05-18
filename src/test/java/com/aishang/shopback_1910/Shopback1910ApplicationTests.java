package com.aishang.shopback_1910;

import com.aishang.shopback_1910.po.OrdersExt;
import com.aishang.shopback_1910.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class Shopback1910ApplicationTests {
    @Resource
    OrdersService ordersService;
    @Test
    void contextLoads() {

    }

}
