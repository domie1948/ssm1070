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
 * @author zsCat 2016-10-31 20:18:32
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_address")
public class OrderAddress extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long memberId;
public Long getMemberId() {return this.getLong("memberId");}
public void setMemberId(Long memberId) {this.set("memberId",memberId);}
private String trueName;
public String getTrueName() {return this.getString("trueName");}
public void setTrueName(String trueName) {this.set("trueName",trueName);}
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
private String telPhone;
public String getTelPhone() {return this.getString("telPhone");}
public void setTelPhone(String telPhone) {this.set("telPhone",telPhone);}
private String mobPhone;
public String getMobPhone() {return this.getString("mobPhone");}
public void setMobPhone(String mobPhone) {this.set("mobPhone",mobPhone);}
private String isDefault;
public String getIsDefault() {return this.getString("isDefault");}
public void setIsDefault(String isDefault) {this.set("isDefault",isDefault);}
private Long provinceId;
public Long getProvinceId() {return this.getLong("provinceId");}
public void setProvinceId(Long provinceId) {this.set("provinceId",provinceId);}
private Integer zipCode;
public Integer getZipCode() {return this.getInteger("zipCode");}
public void setZipCode(Integer zipCode) {this.set("zipCode",zipCode);}


}
