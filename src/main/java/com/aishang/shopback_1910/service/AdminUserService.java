package com.aishang.shopback_1910.service;

import com.aishang.shopback_1910.po.Adminuser;

/**
 * @author yc950710
 */
public interface AdminUserService {

    /**
     * 登录
     * @param adminuser
     * @return
     */
    Adminuser login(Adminuser adminuser);
}
