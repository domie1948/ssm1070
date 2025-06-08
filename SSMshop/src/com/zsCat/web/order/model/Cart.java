//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.model;

import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import com.zsCat.common.base.BaseEntity;


/**
 * 
 * @author zsCat 2016-11-1 17:28:23
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	优惠劵管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_cart")
public class Cart extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long memberId;
public Long getMemberId() {return this.getLong("memberId");}
public void setMemberId(Long memberId) {this.set("memberId",memberId);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private String storeName;
public String getStoreName() {return this.getString("storeName");}
public void setStoreName(String storeName) {this.set("storeName",storeName);}
private Long goodsId;
public Long getGoodsId() {return this.getLong("goodsId");}
public void setGoodsId(Long goodsId) {this.set("goodsId",goodsId);}
private String goodsName;
public String getGoodsName() {return this.getString("goodsName");}
public void setGoodsName(String goodsName) {this.set("goodsName",goodsName);}
private Long specId;
public Long getSpecId() {return this.getLong("specId");}
public void setSpecId(Long specId) {this.set("specId",specId);}
private String specInfo;
public String getSpecInfo() {return this.getString("specInfo");}
public void setSpecInfo(String specInfo) {this.set("specInfo",specInfo);}
private BigDecimal goodsStorePrice;
public BigDecimal getGoodsStorePrice() {return this.getBigDecimal("goodsStorePrice");}
public void setGoodsStorePrice(BigDecimal goodsStorePrice) {this.set("goodsStorePrice",goodsStorePrice);}
private Long goodsNum;
public Long getGoodsNum() {return this.getLong("goodsNum");}
public void setGoodsNum(Long goodsNum) {this.set("goodsNum",goodsNum);}
private String goodsImages;
public String getGoodsImages() {return this.getString("goodsImages");}
public void setGoodsImages(String goodsImages) {this.set("goodsImages",goodsImages);}
private Long firstGcId;
public Long getFirstGcId() {return this.getLong("firstGcId");}
public void setFirstGcId(Long firstGcId) {this.set("firstGcId",firstGcId);}


}
