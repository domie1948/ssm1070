//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.coupon.model;

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
 * @author zsCat 2016-11-1 14:45:58
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	优惠劵管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_coupon")
public class Coupon extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String couponTitle;
public String getCouponTitle() {return this.getString("couponTitle");}
public void setCouponTitle(String couponTitle) {this.set("couponTitle",couponTitle);}
private String couponType;
public String getCouponType() {return this.getString("couponType");}
public void setCouponType(String couponType) {this.set("couponType",couponType);}
private String couponPic;
public String getCouponPic() {return this.getString("couponPic");}
public void setCouponPic(String couponPic) {this.set("couponPic",couponPic);}
private String couponDesc;
public String getCouponDesc() {return this.getString("couponDesc");}
public void setCouponDesc(String couponDesc) {this.set("couponDesc",couponDesc);}
private Long startTime;
public Long getStartTime() {return this.getLong("startTime");}
public void setStartTime(Long startTime) {this.set("startTime",startTime);}
private Long endTime;
public Long getEndTime() {return this.getLong("endTime");}
public void setEndTime(Long endTime) {this.set("endTime",endTime);}
private BigDecimal couponPrice;
public BigDecimal getCouponPrice() {return this.getBigDecimal("couponPrice");}
public void setCouponPrice(BigDecimal couponPrice) {this.set("couponPrice",couponPrice);}
private BigDecimal couponLimit;
public BigDecimal getCouponLimit() {return this.getBigDecimal("couponLimit");}
public void setCouponLimit(BigDecimal couponLimit) {this.set("couponLimit",couponLimit);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private Integer couponState;
public Integer getCouponState() {return this.getInteger("couponState");}
public void setCouponState(Integer couponState) {this.set("couponState",couponState);}
private Integer couponStorage;
public Integer getCouponStorage() {return this.getInteger("couponStorage");}
public void setCouponStorage(Integer couponStorage) {this.set("couponStorage",couponStorage);}
private Integer couponUsage;
public Integer getCouponUsage() {return this.getInteger("couponUsage");}
public void setCouponUsage(Integer couponUsage) {this.set("couponUsage",couponUsage);}
private Integer couponLock;
public Integer getCouponLock() {return this.getInteger("couponLock");}
public void setCouponLock(Integer couponLock) {this.set("couponLock",couponLock);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Integer couponClassId;
public Integer getCouponClassId() {return this.getInteger("couponClassId");}
public void setCouponClassId(Integer couponClassId) {this.set("couponClassId",couponClassId);}
private Integer couponClick;
public Integer getCouponClick() {return this.getInteger("couponClick");}
public void setCouponClick(Integer couponClick) {this.set("couponClick",couponClick);}
private String couponPrintStyle;
public String getCouponPrintStyle() {return this.getString("couponPrintStyle");}
public void setCouponPrintStyle(String couponPrintStyle) {this.set("couponPrintStyle",couponPrintStyle);}
private Long couponRecommend;
public Long getCouponRecommend() {return this.getLong("couponRecommend");}
public void setCouponRecommend(Long couponRecommend) {this.set("couponRecommend",couponRecommend);}
private Long couponAllowstate;
public Long getCouponAllowstate() {return this.getLong("couponAllowstate");}
public void setCouponAllowstate(Long couponAllowstate) {this.set("couponAllowstate",couponAllowstate);}
private String couponAllowremark;
public String getCouponAllowremark() {return this.getString("couponAllowremark");}
public void setCouponAllowremark(String couponAllowremark) {this.set("couponAllowremark",couponAllowremark);}
private String storeName;
public String getStoreName() {return this.getString("storeName");}
public void setStoreName(String storeName) {this.set("storeName",storeName);}
private Long couponGoodsId;
public Long getCouponGoodsId() {return this.getLong("couponGoodsId");}
public void setCouponGoodsId(Long couponGoodsId) {this.set("couponGoodsId",couponGoodsId);}
private Long couponGoodsClass_id;
public Long getCouponGoodsClass_id() {return this.getLong("couponGoodsClass_id");}
public void setCouponGoodsClass_id(Long couponGoodsClass_id) {this.set("couponGoodsClass_id",couponGoodsClass_id);}


}
