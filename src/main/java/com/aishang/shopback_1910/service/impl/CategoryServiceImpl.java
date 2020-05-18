package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.CategoryMapper;
import com.aishang.shopback_1910.po.Category;
import com.aishang.shopback_1910.po.Categorysecond;
import com.aishang.shopback_1910.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    /**
     * 查询全部一级类目
     * @return
     */
    @Override
    public List<Category> getCategories() {
        return categoryMapper.getCategories();
    }

    /**
     * 根据一级类目id查询二级类目集合
     * @param cid
     * @return
     */
    @Override
    public List<Categorysecond> getCategorySeconds(Integer cid) {
        return categoryMapper.getCategorySeconds(cid);
    }
}
