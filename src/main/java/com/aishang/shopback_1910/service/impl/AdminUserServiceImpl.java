package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.AdminuserMapper;
import com.aishang.shopback_1910.po.Adminuser;
import com.aishang.shopback_1910.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yc950710
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminuserMapper adminuserMapper;

    /**
     * 登录
     * @param adminuser
     * @return
     */
    @Override
    public Adminuser login(Adminuser adminuser) {
        return adminuserMapper.login(adminuser);
    }
}
