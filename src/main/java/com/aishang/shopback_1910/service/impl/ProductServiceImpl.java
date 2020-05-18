package com.aishang.shopback_1910.service.impl;

import com.aishang.shopback_1910.dao.ProductMapper;
import com.aishang.shopback_1910.po.Product;
import com.aishang.shopback_1910.po.ProductExt;
import com.aishang.shopback_1910.service.ProductService;
import com.aishang.shopback_1910.util.FileUploadUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.util.net.jsse.JSSEImplementation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.beans.Transient;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author yc950710
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Resource
    private FileUploadUtil fileUploadUtil;

    @Override
    public PageInfo<Product> getProduct(ProductExt productExt) {
        //设置pageNow和pageSize
        PageHelper.startPage(productExt.getPageNow(),8);

        //查询商品结果集
        List<Product> products = productMapper.getAll(productExt);

        //返回商品结果集，products：商品结果集   navigatePages =7  设置页码数为7
        PageInfo<Product> pageInfo = new PageInfo<Product>(products,7);

        return pageInfo;
    }

    /**
     * 添加商品
     * @param multipartFile
     * @param product
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addProduct(MultipartFile multipartFile, Product product) {
        File localFile=null;
        try {
            localFile = fileUploadUtil.doUpload(multipartFile);
            // 上传商品到数据库
            product.setImage(fileUploadUtil.getImgPath(localFile.getPath()));
            product.setPdate(new Date());
            productMapper.addProduct(product);
        } catch (Exception e) {
            if(localFile.exists()){
                localFile.delete();
            }
            throw new RuntimeException();
        }

    }
}
