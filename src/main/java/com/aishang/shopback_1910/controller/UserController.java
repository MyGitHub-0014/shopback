package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.User;
import com.aishang.shopback_1910.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/demo")
    public List<User> demo(){
        List<User> users = userService.getAll();
        return users;
    }
}
