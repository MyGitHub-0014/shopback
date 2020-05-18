package com.aishang.shopback_1910.controller;

import com.aishang.shopback_1910.po.Product;
import com.aishang.shopback_1910.po.ProductExt;
import com.aishang.shopback_1910.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author yc950710
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;

    /**
     * 查询商品列表
     * @return
     */
    @RequestMapping("/getProducts")
    public PageInfo<Product> getProducts(@RequestBody ProductExt productExt){
        //RequestBody接收json参数
        PageInfo<Product> result=productService.getProduct(productExt);
        return result;
    }

    /**
     * 添加商品
     * @RequestParam("file") 指定接收请求头multipart/form-data
     * @RequestBody 指定接收请求头application/json请求头的
     */
    @RequestMapping("/addProduct")
    public String addProduct(@RequestParam("file")MultipartFile multipartFile,Product product){
        productService.addProduct(multipartFile,product);
        return "";
    }

}
