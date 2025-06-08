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
 * @author zsCat 2016-10-31 20:19:35
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	订单管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_goods")
public class OrderGoods extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long orderId;
public Long getOrderId() {return this.getLong("orderId");}
public void setOrderId(Long orderId) {this.set("orderId",orderId);}
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
private BigDecimal goodsPrice;
public BigDecimal getGoodsPrice() {return this.getBigDecimal("goodsPrice");}
public void setGoodsPrice(BigDecimal goodsPrice) {this.set("goodsPrice",goodsPrice);}
private Long goodsNum;
public Long getGoodsNum() {return this.getLong("goodsNum");}
public void setGoodsNum(Long goodsNum) {this.set("goodsNum",goodsNum);}
private String goodsImage;
public String getGoodsImage() {return this.getString("goodsImage");}
public void setGoodsImage(String goodsImage) {this.set("goodsImage",goodsImage);}
private Long goodsReturnnum;
public Long getGoodsReturnnum() {return this.getLong("goodsReturnnum");}
public void setGoodsReturnnum(Long goodsReturnnum) {this.set("goodsReturnnum",goodsReturnnum);}
private Long storesId;
public Long getStoresId() {return this.getLong("storesId");}
public void setStoresId(Long storesId) {this.set("storesId",storesId);}
private Integer evaluationStatus;
public Integer getEvaluationStatus() {return this.getInteger("evaluationStatus");}
public void setEvaluationStatus(Integer evaluationStatus) {this.set("evaluationStatus",evaluationStatus);}
private Long evaluationTime;
public Long getEvaluationTime() {return this.getLong("evaluationTime");}
public void setEvaluationTime(Long evaluationTime) {this.set("evaluationTime",evaluationTime);}
private BigDecimal goodsPayPrice;
public BigDecimal getGoodsPayPrice() {return this.getBigDecimal("goodsPayPrice");}
public void setGoodsPayPrice(BigDecimal goodsPayPrice) {this.set("goodsPayPrice",goodsPayPrice);}
private Long buyerId;
public Long getBuyerId() {return this.getLong("buyerId");}
public void setBuyerId(Long buyerId) {this.set("buyerId",buyerId);}
private Long commisRate;
public Long getCommisRate() {return this.getLong("commisRate");}
public void setCommisRate(Long commisRate) {this.set("commisRate",commisRate);}
private Long gcId;
public Long getGcId() {return this.getLong("gcId");}
public void setGcId(Long gcId) {this.set("gcId",gcId);}


}
