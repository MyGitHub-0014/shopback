package com.aishang.shopback_1910.po;

/**
 * @author yc950710
 */
public class ProductExt extends Product {
    private Integer pageNow;
    private Integer cid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }
}
