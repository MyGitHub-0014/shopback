package com.aishang.shopback_1910.service;

import com.aishang.shopback_1910.po.Category;
import com.aishang.shopback_1910.po.Categorysecond;

import java.util.List;

/**
 * @author yc950710
 */
public interface CategoryService {
    /**
     * 查询全部一级类目
     */
    List<Category> getCategories();

    /**
     * 根据一级类目id查询二级类目集合
     * @param cid
     * @return
     */
    List<Categorysecond> getCategorySeconds(Integer cid);
}
