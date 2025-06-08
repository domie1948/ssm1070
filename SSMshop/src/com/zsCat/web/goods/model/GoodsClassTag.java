//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.model;

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
 * @author zsCat 2016-10-31 14:07:00
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods_class_tag")
public class GoodsClassTag extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long gcId1;
public Long getGcId1() {return this.getLong("gcId1");}
public void setGcId1(Long gcId1) {this.set("gcId1",gcId1);}
private Long gcId2;
public Long getGcId2() {return this.getLong("gcId2");}
public void setGcId2(Long gcId2) {this.set("gcId2",gcId2);}
private Long gcId3;
public Long getGcId3() {return this.getLong("gcId3");}
public void setGcId3(Long gcId3) {this.set("gcId3",gcId3);}
private String gcTagName;
public String getGcTagName() {return this.getString("gcTagName");}
public void setGcTagName(String gcTagName) {this.set("gcTagName",gcTagName);}
private String gcTagValue;
public String getGcTagValue() {return this.getString("gcTagValue");}
public void setGcTagValue(String gcTagValue) {this.set("gcTagValue",gcTagValue);}
private Long gcId;
public Long getGcId() {return this.getLong("gcId");}
public void setGcId(Long gcId) {this.set("gcId",gcId);}
private Long typeId;
public Long getTypeId() {return this.getLong("typeId");}
public void setTypeId(Long typeId) {this.set("typeId",typeId);}


}
