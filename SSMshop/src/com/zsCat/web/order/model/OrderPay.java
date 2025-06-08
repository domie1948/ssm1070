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
 * @author zsCat 2016-10-31 20:20:23
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	订单管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_pay")
public class OrderPay extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String paySn;
public String getPaySn() {return this.getString("paySn");}
public void setPaySn(String paySn) {this.set("paySn",paySn);}
private Long buyerId;
public Long getBuyerId() {return this.getLong("buyerId");}
public void setBuyerId(Long buyerId) {this.set("buyerId",buyerId);}
private String apiPayState;
public String getApiPayState() {return this.getString("apiPayState");}
public void setApiPayState(String apiPayState) {this.set("apiPayState",apiPayState);}


}
