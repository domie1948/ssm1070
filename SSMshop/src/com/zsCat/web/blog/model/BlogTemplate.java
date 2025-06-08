//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.blog.model;

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
 * @author zsCat 2016-10-31 13:22:08
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	我的官网
 */
@SuppressWarnings({ "unused"})
@Table(name="t_blog_template")
public class BlogTemplate extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String title;
public String getTitle() {return this.getString("title");}
public void setTitle(String title) {this.set("title",title);}
private String summary;
public String getSummary() {return this.getString("summary");}
public void setSummary(String summary) {this.set("summary",summary);}
@DateTimeFormat( pattern = "yyyy-MM-dd" )
private Date releasedate;
public Date getReleasedate() {return this.getDate("releasedate");}
public void setReleasedate(Date releasedate) {this.set("releasedate",releasedate);}
private Integer clickhit;
public Integer getClickhit() {return this.getInteger("clickhit");}
public void setClickhit(Integer clickhit) {this.set("clickhit",clickhit);}
private Integer replyhit;
public Integer getReplyhit() {return this.getInteger("replyhit");}
public void setReplyhit(Integer replyhit) {this.set("replyhit",replyhit);}
private String content;
public String getContent() {return this.getString("content");}
public void setContent(String content) {this.set("content",content);}
private String keyword;
public String getKeyword() {return this.getString("keyword");}
public void setKeyword(String keyword) {this.set("keyword",keyword);}


}
