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
 * @author zsCat 2016-10-31 20:18:57
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	订单管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_common")
public class OrderCommon extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long orderId;
public Long getOrderId() {return this.getLong("orderId");}
public void setOrderId(Long orderId) {this.set("orderId",orderId);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private Integer shippingExpressId;
public Integer getShippingExpressId() {return this.getInteger("shippingExpressId");}
public void setShippingExpressId(Integer shippingExpressId) {this.set("shippingExpressId",shippingExpressId);}
private String evalsellerState;
public String getEvalsellerState() {return this.getString("evalsellerState");}
public void setEvalsellerState(String evalsellerState) {this.set("evalsellerState",evalsellerState);}
private String orderMessage;
public String getOrderMessage() {return this.getString("orderMessage");}
public void setOrderMessage(String orderMessage) {this.set("orderMessage",orderMessage);}
private Integer orderPointscount;
public Integer getOrderPointscount() {return this.getInteger("orderPointscount");}
public void setOrderPointscount(Integer orderPointscount) {this.set("orderPointscount",orderPointscount);}
private BigDecimal voucherPrice;
public BigDecimal getVoucherPrice() {return this.getBigDecimal("voucherPrice");}
public void setVoucherPrice(BigDecimal voucherPrice) {this.set("voucherPrice",voucherPrice);}
private String voucherCode;
public String getVoucherCode() {return this.getString("voucherCode");}
public void setVoucherCode(String voucherCode) {this.set("voucherCode",voucherCode);}
private String deliverExplain;
public String getDeliverExplain() {return this.getString("deliverExplain");}
public void setDeliverExplain(String deliverExplain) {this.set("deliverExplain",deliverExplain);}
private Long daddressId;
public Long getDaddressId() {return this.getLong("daddressId");}
public void setDaddressId(Long daddressId) {this.set("daddressId",daddressId);}
private String reciverName;
public String getReciverName() {return this.getString("reciverName");}
public void setReciverName(String reciverName) {this.set("reciverName",reciverName);}
private String reciverInfo;
public String getReciverInfo() {return this.getString("reciverInfo");}
public void setReciverInfo(String reciverInfo) {this.set("reciverInfo",reciverInfo);}
private Long reciverProvinceId;
public Long getReciverProvinceId() {return this.getLong("reciverProvinceId");}
public void setReciverProvinceId(Long reciverProvinceId) {this.set("reciverProvinceId",reciverProvinceId);}
private String invoiceInfo;
public String getInvoiceInfo() {return this.getString("invoiceInfo");}
public void setInvoiceInfo(String invoiceInfo) {this.set("invoiceInfo",invoiceInfo);}
private String promotionInfo;
public String getPromotionInfo() {return this.getString("promotionInfo");}
public void setPromotionInfo(String promotionInfo) {this.set("promotionInfo",promotionInfo);}
private Long shippingTime;
public Long getShippingTime() {return this.getLong("shippingTime");}
public void setShippingTime(Long shippingTime) {this.set("shippingTime",shippingTime);}
private Long evaluationTime;
public Long getEvaluationTime() {return this.getLong("evaluationTime");}
public void setEvaluationTime(Long evaluationTime) {this.set("evaluationTime",evaluationTime);}
private Long evalsellerTime;
public Long getEvalsellerTime() {return this.getLong("evalsellerTime");}
public void setEvalsellerTime(Long evalsellerTime) {this.set("evalsellerTime",evalsellerTime);}


}
