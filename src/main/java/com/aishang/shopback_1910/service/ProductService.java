package com.aishang.shopback_1910.service;

import com.aishang.shopback_1910.po.Product;
import com.aishang.shopback_1910.po.ProductExt;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yc950710
 */
public interface ProductService {
    /**
     * 查询商品列表
     * @param productExt
     * @return
     */
    PageInfo<Product> getProduct(ProductExt productExt);

    /**
     * 添加商品
     * @param multipartFile
     * @param product
     */
    void addProduct(MultipartFile multipartFile, Product product);
}
