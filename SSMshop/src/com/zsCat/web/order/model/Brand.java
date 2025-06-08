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
 * @author zsCat 2016-10-31 20:17:59
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_brand")
public class Brand extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String brandName;
public String getBrandName() {return this.getString("brandName");}
public void setBrandName(String brandName) {this.set("brandName",brandName);}
private String brandClass;
public String getBrandClass() {return this.getString("brandClass");}
public void setBrandClass(String brandClass) {this.set("brandClass",brandClass);}
private String brandPic;
public String getBrandPic() {return this.getString("brandPic");}
public void setBrandPic(String brandPic) {this.set("brandPic",brandPic);}
private Long brandSort;
public Long getBrandSort() {return this.getLong("brandSort");}
public void setBrandSort(Long brandSort) {this.set("brandSort",brandSort);}
private Integer brandRecommend;
public Integer getBrandRecommend() {return this.getInteger("brandRecommend");}
public void setBrandRecommend(Integer brandRecommend) {this.set("brandRecommend",brandRecommend);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private Integer brandApply;
public Integer getBrandApply() {return this.getInteger("brandApply");}
public void setBrandApply(Integer brandApply) {this.set("brandApply",brandApply);}
private Long classId;
public Long getClassId() {return this.getLong("classId");}
public void setClassId(Long classId) {this.set("classId",classId);}
private Integer isDel;
public Integer getIsDel() {return this.getInteger("isDel");}
public void setIsDel(Integer isDel) {this.set("isDel",isDel);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}


}
