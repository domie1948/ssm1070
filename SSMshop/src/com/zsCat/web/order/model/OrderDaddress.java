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
 * @author zsCat 2016-10-31 20:19:18
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	订单管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_daddress")
public class OrderDaddress extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long addressId;
public Long getAddressId() {return this.getLong("addressId");}
public void setAddressId(Long addressId) {this.set("addressId",addressId);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private String sellerName;
public String getSellerName() {return this.getString("sellerName");}
public void setSellerName(String sellerName) {this.set("sellerName",sellerName);}
private Long areaId;
public Long getAreaId() {return this.getLong("areaId");}
public void setAreaId(Long areaId) {this.set("areaId",areaId);}
private Long cityId;
public Long getCityId() {return this.getLong("cityId");}
public void setCityId(Long cityId) {this.set("cityId",cityId);}
private String areaInfo;
public String getAreaInfo() {return this.getString("areaInfo");}
public void setAreaInfo(String areaInfo) {this.set("areaInfo",areaInfo);}
private String address;
public String getAddress() {return this.getString("address");}
public void setAddress(String address) {this.set("address",address);}
private Integer zipCode;
public Integer getZipCode() {return this.getInteger("zipCode");}
public void setZipCode(Integer zipCode) {this.set("zipCode",zipCode);}
private String telPhone;
public String getTelPhone() {return this.getString("telPhone");}
public void setTelPhone(String telPhone) {this.set("telPhone",telPhone);}
private String mobPhone;
public String getMobPhone() {return this.getString("mobPhone");}
public void setMobPhone(String mobPhone) {this.set("mobPhone",mobPhone);}
private String company;
public String getCompany() {return this.getString("company");}
public void setCompany(String company) {this.set("company",company);}
private String content;
public String getContent() {return this.getString("content");}
public void setContent(String content) {this.set("content",content);}
private String isDefault;
public String getIsDefault() {return this.getString("isDefault");}
public void setIsDefault(String isDefault) {this.set("isDefault",isDefault);}
private Long provinceId;
public Long getProvinceId() {return this.getLong("provinceId");}
public void setProvinceId(Long provinceId) {this.set("provinceId",provinceId);}
private String orderId;
public String getOrderId() {return this.getString("orderId");}
public void setOrderId(String orderId) {this.set("orderId",orderId);}


}
