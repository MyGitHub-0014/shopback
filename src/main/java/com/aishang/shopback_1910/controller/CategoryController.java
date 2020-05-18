package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.Category;
import com.aishang.shopback_1910.po.Categorysecond;
import com.aishang.shopback_1910.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc950710
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    CategoryService categoryService;

    /**
     * 查询全部一级类目
     * @return
     */
    @RequestMapping("/getCategories")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    /**
     * 根据一级类目id查询二级类目集合
     */
    @RequestMapping("/getCategorySeconds")
    public List<Categorysecond> getCategorySeconds(Integer cid){
        return categoryService.getCategorySeconds(cid);
    }
}
