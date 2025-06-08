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
 * @author zsCat 2016-11-1 14:46:10
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	优惠劵管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_coupon_class")
public class CouponClass extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long classParentId;
public Long getClassParentId() {return this.getLong("classParentId");}
public void setClassParentId(Long classParentId) {this.set("classParentId",classParentId);}
private String className;
public String getClassName() {return this.getString("className");}
public void setClassName(String className) {this.set("className",className);}
private Long classSort;
public Long getClassSort() {return this.getLong("classSort");}
public void setClassSort(Long classSort) {this.set("classSort",classSort);}
private Integer classShow;
public Integer getClassShow() {return this.getInteger("classShow");}
public void setClassShow(Integer classShow) {this.set("classShow",classShow);}


}
