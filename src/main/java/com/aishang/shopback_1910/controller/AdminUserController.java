package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.Adminuser;
import com.aishang.shopback_1910.service.AdminUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Resource
    private AdminUserService adminUserService;
    @Resource
    HttpSession session;
    /**
     * 用户登录
     * @param adminuser
     * @return
     */
    @RequestMapping("/login")
    public Adminuser login(@RequestBody Adminuser adminuser){
        Adminuser result = adminUserService.login(adminuser);
        if(result!=null){
            session.setAttribute("adminUser",result);
        }
        return result;
    }
}
