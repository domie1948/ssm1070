package com.zsCat.common.redis.bean;

import java.math.BigDecimal;

public class RedisGoods {

	private Long id;
	private String goodsName;
	private String goodsImage;
	private BigDecimal goodsStorePrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public BigDecimal getGoodsStorePrice() {
		return goodsStorePrice;
	}
	public void setGoodsStorePrice(BigDecimal goodsStorePrice) {
		this.goodsStorePrice = goodsStorePrice;
	}
	
	
}
