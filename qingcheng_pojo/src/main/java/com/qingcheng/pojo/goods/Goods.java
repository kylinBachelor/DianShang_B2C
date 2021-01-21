package com.qingcheng.pojo.goods;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: MaleHunter
 * @Date: 2021/1/20 11:11
 * @Package: com.qingcheng.pojo.goods
 * @CurrentProject: qingcheng_parent
 * @version: 1.0
 */
public class Goods implements Serializable {
  private Spu spu;
  private List<Sku> skuList;

  public Spu getSpu() {
    return spu;
  }

  public void setSpu(Spu spu) {
    this.spu = spu;
  }

  public List<Sku> getSkuList() {
    return skuList;
  }

  public void setSkuList(List<Sku> skuList) {
    this.skuList = skuList;
  }
}
