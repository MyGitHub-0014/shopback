package com.aishang.shopback_1910.dao;

import com.aishang.shopback_1910.po.Product;
import com.aishang.shopback_1910.po.ProductExt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;

import java.util.List;

/**
 * @author yc950710
 */
@Mapper
public interface ProductMapper extends MyMapper<Product> {
    /**
     * 商品分页列表
     * @param productExt
     * @return
     */
    List<Product> getAll(ProductExt productExt);

    /**
     * 添加商品
     */
    @Insert("insert into product values(default,#{pname},#{marketPrice},#{shopPrice},#{image},#{pdesc},#{isHot},#{pdate},#{csid})")
    void addProduct(Product product);
}