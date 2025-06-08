//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.model;

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
 * @author zsCat 2016-10-31 20:30:59
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	基础管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_article_class")
public class ArticleClass extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String acCode;
public String getAcCode() {return this.getString("acCode");}
public void setAcCode(String acCode) {this.set("acCode",acCode);}
private String acName;
public String getAcName() {return this.getString("acName");}
public void setAcName(String acName) {this.set("acName",acName);}
private Long acParentId;
public Long getAcParentId() {return this.getLong("acParentId");}
public void setAcParentId(Long acParentId) {this.set("acParentId",acParentId);}
private Long acSort;
public Long getAcSort() {return this.getLong("acSort");}
public void setAcSort(Long acSort) {this.set("acSort",acSort);}
private Integer isDel;
public Integer getIsDel() {return this.getInteger("isDel");}
public void setIsDel(Integer isDel) {this.set("isDel",isDel);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}
private Integer acStatus;
public Integer getAcStatus() {return this.getInteger("acStatus");}
public void setAcStatus(Integer acStatus) {this.set("acStatus",acStatus);}


}
