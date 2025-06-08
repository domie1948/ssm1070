//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.model;

import java.util.Date;
import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.zsCat.common.base.BaseEntity;


/**
 * 
 * @author zsCat 2016-10-31 16:32:55
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_type")
public class ShopType extends BaseEntity {

	private static final long serialVersionUID = 1L;
		 private String title;
public String getTitle() {return this.getString("title");}
public void setTitle(String title) {this.set("title",title);}
  		 private String name;
public String getName() {return this.getString("name");}
public void setName(String name) {this.set("name",name);}
private Integer typesort;
public Integer getTypesort() {return this.getInteger("typesort");}
public void setTypesort(Integer typesort) {this.set("typesort",typesort);}
private Long parentId;
public Long getParentId() {return this.getLong("parentId");}
public void setParentId(Long parentId) {this.set("parentId",parentId);}
private String stidpath;
public String getStidpath() {return this.getString("stidpath");}
public void setStidpath(String stidpath) {this.set("stidpath",stidpath);}
private Integer expenscale;
public Integer getExpenscale() {return this.getInteger("expenscale");}
public void setExpenscale(Integer expenscale) {this.set("expenscale",expenscale);}
private String parentIds;
public String getParentIds() {return this.getString("parentIds");}
public void setParentIds(String parentIds) {this.set("parentIds",parentIds);}

@Transient
private String oldParentIds; //旧的pids,非表中字段，用作更新用
  public String getOldParentIds() {
		return this.getString("oldParentIds");
  }
 
  public void setOldParentIds(String oldParentIds) {
		this.set("oldParentIds", oldParentIds);
  }

}
