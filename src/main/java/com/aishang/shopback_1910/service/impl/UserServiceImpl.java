package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.UserMapper;
import com.aishang.shopback_1910.po.User;
import com.aishang.shopback_1910.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
