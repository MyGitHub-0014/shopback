package com.aishang.shopback_1910.dao;

import com.aishang.shopback_1910.po.Adminuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;
/**
 * @author yc950710
 */
@Mapper
public interface AdminuserMapper extends MyMapper<Adminuser> {

    /**
     * 登录
     * @param adminuser
     * @return
     */
    @Select("select * from adminuser where username=#{username} and password=#{password}")
    Adminuser login(Adminuser adminuser);
}