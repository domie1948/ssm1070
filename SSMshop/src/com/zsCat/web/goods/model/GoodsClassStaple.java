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
 * @author zsCat 2016-10-31 14:06:39
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods_class_staple")
public class GoodsClassStaple extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String stapleName;
public String getStapleName() {return this.getString("stapleName");}
public void setStapleName(String stapleName) {this.set("stapleName",stapleName);}
private Long gcId1;
public Long getGcId1() {return this.getLong("gcId1");}
public void setGcId1(Long gcId1) {this.set("gcId1",gcId1);}
private Long gcId2;
public Long getGcId2() {return this.getLong("gcId2");}
public void setGcId2(Long gcId2) {this.set("gcId2",gcId2);}
private Long gcId3;
public Long getGcId3() {return this.getLong("gcId3");}
public void setGcId3(Long gcId3) {this.set("gcId3",gcId3);}
private Long typeId;
public Long getTypeId() {return this.getLong("typeId");}
public void setTypeId(Long typeId) {this.set("typeId",typeId);}
private Long memberId;
public Long getMemberId() {return this.getLong("memberId");}
public void setMemberId(Long memberId) {this.set("memberId",memberId);}
private Long counter;
public Long getCounter() {return this.getLong("counter");}
public void setCounter(Long counter) {this.set("counter",counter);}


}
