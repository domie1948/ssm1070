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
 * @author zsCat 2016-10-31 20:30:43
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	基础管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_article")
public class Article extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long acId;
public Long getAcId() {return this.getLong("acId");}
public void setAcId(Long acId) {this.set("acId",acId);}
private String articleUrl;
public String getArticleUrl() {return this.getString("articleUrl");}
public void setArticleUrl(String articleUrl) {this.set("articleUrl",articleUrl);}
private Long articleShow;
public Long getArticleShow() {return this.getLong("articleShow");}
public void setArticleShow(Long articleShow) {this.set("articleShow",articleShow);}
private Long articleSort;
public Long getArticleSort() {return this.getLong("articleSort");}
public void setArticleSort(Long articleSort) {this.set("articleSort",articleSort);}
private String articleTitle;
public String getArticleTitle() {return this.getString("articleTitle");}
public void setArticleTitle(String articleTitle) {this.set("articleTitle",articleTitle);}
private String articleContent;
public String getArticleContent() {return this.getString("articleContent");}
public void setArticleContent(String articleContent) {this.set("articleContent",articleContent);}
private Integer isDel;
public Integer getIsDel() {return this.getInteger("isDel");}
public void setIsDel(Integer isDel) {this.set("isDel",isDel);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}
private Long articleTime;
public Long getArticleTime() {return this.getLong("articleTime");}
public void setArticleTime(Long articleTime) {this.set("articleTime",articleTime);}


}
