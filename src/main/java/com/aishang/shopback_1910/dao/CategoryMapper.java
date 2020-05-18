package com.aishang.shopback_1910.dao;

import com.aishang.shopback_1910.po.Category;
import com.aishang.shopback_1910.po.Categorysecond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;
@Mapper
public interface CategoryMapper extends MyMapper<Category> {
    /**
     * 查询全部一级类目
     * @return
     */
    @Select("select * from category")
    List<Category> getCategories();

    /**
     * 根据一级类目id查询二级类目集合
     * @param cid
     * @return
     */
    @Select("select * from categorySecond where cid=#{cid}")
    List<Categorysecond> getCategorySeconds(Integer cid);

}