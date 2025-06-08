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
 * @author zsCat 2016-10-31 20:18:17
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order")
public class Order extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String orderSn;
public String getOrderSn() {return this.getString("orderSn");}
public void setOrderSn(String orderSn) {this.set("orderSn",orderSn);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private String storeName;
public String getStoreName() {return this.getString("storeName");}
public void setStoreName(String storeName) {this.set("storeName",storeName);}
private Long buyerId;
public Long getBuyerId() {return this.getLong("buyerId");}
public void setBuyerId(Long buyerId) {this.set("buyerId",buyerId);}
private String buyerName;
public String getBuyerName() {return this.getString("buyerName");}
public void setBuyerName(String buyerName) {this.set("buyerName",buyerName);}
private String buyerEmail;
public String getBuyerEmail() {return this.getString("buyerEmail");}
public void setBuyerEmail(String buyerEmail) {this.set("buyerEmail",buyerEmail);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Integer orderType;
public Integer getOrderType() {return this.getInteger("orderType");}
public void setOrderType(Integer orderType) {this.set("orderType",orderType);}
private Long paymentId;
public Long getPaymentId() {return this.getLong("paymentId");}
public void setPaymentId(Long paymentId) {this.set("paymentId",paymentId);}
private String paymentName;
public String getPaymentName() {return this.getString("paymentName");}
public void setPaymentName(String paymentName) {this.set("paymentName",paymentName);}
private String paymentCode;
public String getPaymentCode() {return this.getString("paymentCode");}
public void setPaymentCode(String paymentCode) {this.set("paymentCode",paymentCode);}
private String paymentBranch;
public String getPaymentBranch() {return this.getString("paymentBranch");}
public void setPaymentBranch(String paymentBranch) {this.set("paymentBranch",paymentBranch);}
private String paymentDirect;
public String getPaymentDirect() {return this.getString("paymentDirect");}
public void setPaymentDirect(String paymentDirect) {this.set("paymentDirect",paymentDirect);}
private Integer paymentState;
public Integer getPaymentState() {return this.getInteger("paymentState");}
public void setPaymentState(Integer paymentState) {this.set("paymentState",paymentState);}
private String outSn;
public String getOutSn() {return this.getString("outSn");}
public void setOutSn(String outSn) {this.set("outSn",outSn);}
private String tradeSn;
public String getTradeSn() {return this.getString("tradeSn");}
public void setTradeSn(String tradeSn) {this.set("tradeSn",tradeSn);}
private Long paymentTime;
public Long getPaymentTime() {return this.getLong("paymentTime");}
public void setPaymentTime(Long paymentTime) {this.set("paymentTime",paymentTime);}
private String payMessage;
public String getPayMessage() {return this.getString("payMessage");}
public void setPayMessage(String payMessage) {this.set("payMessage",payMessage);}
private Long shippingTime;
public Long getShippingTime() {return this.getLong("shippingTime");}
public void setShippingTime(Long shippingTime) {this.set("shippingTime",shippingTime);}
private Integer shippingExpressId;
public Integer getShippingExpressId() {return this.getInteger("shippingExpressId");}
public void setShippingExpressId(Integer shippingExpressId) {this.set("shippingExpressId",shippingExpressId);}
private String shippingCode;
public String getShippingCode() {return this.getString("shippingCode");}
public void setShippingCode(String shippingCode) {this.set("shippingCode",shippingCode);}
private String outPaymentCode;
public String getOutPaymentCode() {return this.getString("outPaymentCode");}
public void setOutPaymentCode(String outPaymentCode) {this.set("outPaymentCode",outPaymentCode);}
private Long finnshedTime;
public Long getFinnshedTime() {return this.getLong("finnshedTime");}
public void setFinnshedTime(Long finnshedTime) {this.set("finnshedTime",finnshedTime);}
private String invoice;
public String getInvoice() {return this.getString("invoice");}
public void setInvoice(String invoice) {this.set("invoice",invoice);}
private BigDecimal goodsAmount;
public BigDecimal getGoodsAmount() {return this.getBigDecimal("goodsAmount");}
public void setGoodsAmount(BigDecimal goodsAmount) {this.set("goodsAmount",goodsAmount);}
private BigDecimal discount;
public BigDecimal getDiscount() {return this.getBigDecimal("discount");}
public void setDiscount(BigDecimal discount) {this.set("discount",discount);}
private BigDecimal orderAmount;
public BigDecimal getOrderAmount() {return this.getBigDecimal("orderAmount");}
public void setOrderAmount(BigDecimal orderAmount) {this.set("orderAmount",orderAmount);}
private BigDecimal orderTotalPrice;
public BigDecimal getOrderTotalPrice() {return this.getBigDecimal("orderTotalPrice");}
public void setOrderTotalPrice(BigDecimal orderTotalPrice) {this.set("orderTotalPrice",orderTotalPrice);}
private BigDecimal shippingFee;
public BigDecimal getShippingFee() {return this.getBigDecimal("shippingFee");}
public void setShippingFee(BigDecimal shippingFee) {this.set("shippingFee",shippingFee);}
private String shippingName;
public String getShippingName() {return this.getString("shippingName");}
public void setShippingName(String shippingName) {this.set("shippingName",shippingName);}
private Integer evaluationStatus;
public Integer getEvaluationStatus() {return this.getInteger("evaluationStatus");}
public void setEvaluationStatus(Integer evaluationStatus) {this.set("evaluationStatus",evaluationStatus);}
private Long evaluationTime;
public Long getEvaluationTime() {return this.getLong("evaluationTime");}
public void setEvaluationTime(Long evaluationTime) {this.set("evaluationTime",evaluationTime);}
private Integer evalsellerStatus;
public Integer getEvalsellerStatus() {return this.getInteger("evalsellerStatus");}
public void setEvalsellerStatus(Integer evalsellerStatus) {this.set("evalsellerStatus",evalsellerStatus);}
private Long evalsellerTime;
public Long getEvalsellerTime() {return this.getLong("evalsellerTime");}
public void setEvalsellerTime(Long evalsellerTime) {this.set("evalsellerTime",evalsellerTime);}
private String orderMessage;
public String getOrderMessage() {return this.getString("orderMessage");}
public void setOrderMessage(String orderMessage) {this.set("orderMessage",orderMessage);}
private Integer orderState;
public Integer getOrderState() {return this.getInteger("orderState");}
public void setOrderState(Integer orderState) {this.set("orderState",orderState);}
private Integer orderPointscount;
public Integer getOrderPointscount() {return this.getInteger("orderPointscount");}
public void setOrderPointscount(Integer orderPointscount) {this.set("orderPointscount",orderPointscount);}
private Integer voucherId;
public Integer getVoucherId() {return this.getInteger("voucherId");}
public void setVoucherId(Integer voucherId) {this.set("voucherId",voucherId);}
private BigDecimal voucherPrice;
public BigDecimal getVoucherPrice() {return this.getBigDecimal("voucherPrice");}
public void setVoucherPrice(BigDecimal voucherPrice) {this.set("voucherPrice",voucherPrice);}
private String voucherCode;
public String getVoucherCode() {return this.getString("voucherCode");}
public void setVoucherCode(String voucherCode) {this.set("voucherCode",voucherCode);}
private Long refundState;
public Long getRefundState() {return this.getLong("refundState");}
public void setRefundState(Long refundState) {this.set("refundState",refundState);}
private Long returnState;
public Long getReturnState() {return this.getLong("returnState");}
public void setReturnState(Long returnState) {this.set("returnState",returnState);}
private BigDecimal refundAmount;
public BigDecimal getRefundAmount() {return this.getBigDecimal("refundAmount");}
public void setRefundAmount(BigDecimal refundAmount) {this.set("refundAmount",refundAmount);}
private Long returnNum;
public Long getReturnNum() {return this.getLong("returnNum");}
public void setReturnNum(Long returnNum) {this.set("returnNum",returnNum);}
private Long groupId;
public Long getGroupId() {return this.getLong("groupId");}
public void setGroupId(Long groupId) {this.set("groupId",groupId);}
private Long groupCount;
public Long getGroupCount() {return this.getLong("groupCount");}
public void setGroupCount(Long groupCount) {this.set("groupCount",groupCount);}
private Long xianshiId;
public Long getXianshiId() {return this.getLong("xianshiId");}
public void setXianshiId(Long xianshiId) {this.set("xianshiId",xianshiId);}
private String xianshiExplain;
public String getXianshiExplain() {return this.getString("xianshiExplain");}
public void setXianshiExplain(String xianshiExplain) {this.set("xianshiExplain",xianshiExplain);}
private Long mansongId;
public Long getMansongId() {return this.getLong("mansongId");}
public void setMansongId(Long mansongId) {this.set("mansongId",mansongId);}
private String mansongExplain;
public String getMansongExplain() {return this.getString("mansongExplain");}
public void setMansongExplain(String mansongExplain) {this.set("mansongExplain",mansongExplain);}
private Integer bundlingId;
public Integer getBundlingId() {return this.getInteger("bundlingId");}
public void setBundlingId(Integer bundlingId) {this.set("bundlingId",bundlingId);}
private String bundlingExplain;
public String getBundlingExplain() {return this.getString("bundlingExplain");}
public void setBundlingExplain(String bundlingExplain) {this.set("bundlingExplain",bundlingExplain);}
private String orderFrom;
public String getOrderFrom() {return this.getString("orderFrom");}
public void setOrderFrom(String orderFrom) {this.set("orderFrom",orderFrom);}
private String deliverExplain;
public String getDeliverExplain() {return this.getString("deliverExplain");}
public void setDeliverExplain(String deliverExplain) {this.set("deliverExplain",deliverExplain);}
private Long daddressId;
public Long getDaddressId() {return this.getLong("daddressId");}
public void setDaddressId(Long daddressId) {this.set("daddressId",daddressId);}
private Long addressId;
public Long getAddressId() {return this.getLong("addressId");}
public void setAddressId(Long addressId) {this.set("addressId",addressId);}
private Long payId;
public Long getPayId() {return this.getLong("payId");}
public void setPayId(Long payId) {this.set("payId",payId);}
private String paySn;
public String getPaySn() {return this.getString("paySn");}
public void setPaySn(String paySn) {this.set("paySn",paySn);}
private Integer balanceState;
public Integer getBalanceState() {return this.getInteger("balanceState");}
public void setBalanceState(Integer balanceState) {this.set("balanceState",balanceState);}
private Long balanceTime;
public Long getBalanceTime() {return this.getLong("balanceTime");}
public void setBalanceTime(Long balanceTime) {this.set("balanceTime",balanceTime);}
private String shippingExpressCode;
public String getShippingExpressCode() {return this.getString("shippingExpressCode");}
public void setShippingExpressCode(String shippingExpressCode) {this.set("shippingExpressCode",shippingExpressCode);}
private BigDecimal predepositAmount;
public BigDecimal getPredepositAmount() {return this.getBigDecimal("predepositAmount");}
public void setPredepositAmount(BigDecimal predepositAmount) {this.set("predepositAmount",predepositAmount);}
private String cancelCause;
public String getCancelCause() {return this.getString("cancelCause");}
public void setCancelCause(String cancelCause) {this.set("cancelCause",cancelCause);}
private Long couponId;
public Long getCouponId() {return this.getLong("couponId");}
public void setCouponId(Long couponId) {this.set("couponId",couponId);}
private BigDecimal couponPrice;
public BigDecimal getCouponPrice() {return this.getBigDecimal("couponPrice");}
public void setCouponPrice(BigDecimal couponPrice) {this.set("couponPrice",couponPrice);}
private BigDecimal promoPrice;
public BigDecimal getPromoPrice() {return this.getBigDecimal("promoPrice");}
public void setPromoPrice(BigDecimal promoPrice) {this.set("promoPrice",promoPrice);}
private Integer lockState;
public Integer getLockState() {return this.getInteger("lockState");}
public void setLockState(Integer lockState) {this.set("lockState",lockState);}


}
