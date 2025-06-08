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
 * @author zsCat 2016-10-31 20:19:52
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	订单管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_order_invoice")
public class OrderInvoice extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long memberId;
public Long getMemberId() {return this.getLong("memberId");}
public void setMemberId(Long memberId) {this.set("memberId",memberId);}
private Long orderId;
public Long getOrderId() {return this.getLong("orderId");}
public void setOrderId(Long orderId) {this.set("orderId",orderId);}
private String invState;
public String getInvState() {return this.getString("invState");}
public void setInvState(String invState) {this.set("invState",invState);}
private String invTitle;
public String getInvTitle() {return this.getString("invTitle");}
public void setInvTitle(String invTitle) {this.set("invTitle",invTitle);}
private String invContent;
public String getInvContent() {return this.getString("invContent");}
public void setInvContent(String invContent) {this.set("invContent",invContent);}
private String invCompany;
public String getInvCompany() {return this.getString("invCompany");}
public void setInvCompany(String invCompany) {this.set("invCompany",invCompany);}
private String invCode;
public String getInvCode() {return this.getString("invCode");}
public void setInvCode(String invCode) {this.set("invCode",invCode);}
private String invRegAddr;
public String getInvRegAddr() {return this.getString("invRegAddr");}
public void setInvRegAddr(String invRegAddr) {this.set("invRegAddr",invRegAddr);}
private String invRegPhone;
public String getInvRegPhone() {return this.getString("invRegPhone");}
public void setInvRegPhone(String invRegPhone) {this.set("invRegPhone",invRegPhone);}
private String invRegBname;
public String getInvRegBname() {return this.getString("invRegBname");}
public void setInvRegBname(String invRegBname) {this.set("invRegBname",invRegBname);}
private String invRegBaccount;
public String getInvRegBaccount() {return this.getString("invRegBaccount");}
public void setInvRegBaccount(String invRegBaccount) {this.set("invRegBaccount",invRegBaccount);}
private String invRecName;
public String getInvRecName() {return this.getString("invRecName");}
public void setInvRecName(String invRecName) {this.set("invRecName",invRecName);}
private String invRecMobphone;
public String getInvRecMobphone() {return this.getString("invRecMobphone");}
public void setInvRecMobphone(String invRecMobphone) {this.set("invRecMobphone",invRecMobphone);}
private String invRecProvince;
public String getInvRecProvince() {return this.getString("invRecProvince");}
public void setInvRecProvince(String invRecProvince) {this.set("invRecProvince",invRecProvince);}
private String invGotoAddr;
public String getInvGotoAddr() {return this.getString("invGotoAddr");}
public void setInvGotoAddr(String invGotoAddr) {this.set("invGotoAddr",invGotoAddr);}
private Integer isDefault;
public Integer getIsDefault() {return this.getInteger("isDefault");}
public void setIsDefault(Integer isDefault) {this.set("isDefault",isDefault);}


}
