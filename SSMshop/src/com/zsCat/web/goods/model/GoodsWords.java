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
 * @author zsCat 2016-10-31 13:58:58
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods_words")
public class GoodsWords extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String keyword;
public String getKeyword() {return this.getString("keyword");}
public void setKeyword(String keyword) {this.set("keyword",keyword);}
private String quanping;
public String getQuanping() {return this.getString("quanping");}
public void setQuanping(String quanping) {this.set("quanping",quanping);}
private String shouzimu;
public String getShouzimu() {return this.getString("shouzimu");}
public void setShouzimu(String shouzimu) {this.set("shouzimu",shouzimu);}
private Integer wordsNum;
public Integer getWordsNum() {return this.getInteger("wordsNum");}
public void setWordsNum(Integer wordsNum) {this.set("wordsNum",wordsNum);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}


}
