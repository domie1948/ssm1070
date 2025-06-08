//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.model;

import java.util.Date;
import java.util.List;
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
 * @author zsCat 2016-10-31 14:05:23
 * @Email: 951449465@qq.com
 * @version 4.0v 商品管理
 */
@SuppressWarnings({ "unused" })
@Table(name = "shop_goods_class")
public class GoodsClass extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Transient
	 List<GoodsClass> gcList;
	 
	public List<GoodsClass> getGcList() {
		return gcList;
	}

	public void setGcList(List<GoodsClass> gcList) {
		this.gcList = gcList;
	}
	private Long parentId; //parent_id <父级编号>

	 private String parentIds; //parent_ids <所有父级编号>
	 @Transient
	  private String oldParentIds; //旧的pids,非表中字段，用作更新用
	 
	 public Long getParentId() {
			return this.getLong("parentId");
	    }
	   
	    public void setParentId(Long parentId) {
			this.set("parentId", parentId);
	    }

		public String getParentIds() {
			return this.getString("parentIds");
	    }
	   
	    public void setParentIds(String parentIds) {
			this.set("parentIds", parentIds);
	    }
	 
	 
	    public String getOldParentIds() {
			return this.getString("oldParentIds");
	    }
	   
	    public void setOldParentIds(String oldParentIds) {
			this.set("oldParentIds", oldParentIds);
	    }
	private String name;

	public String getName() {
		return this.getString("name");
	}

	public void setName(String name) {
		this.set("name", name);
	}

	private String gcPic;

	public String getGcPic() {
		return this.getString("gcPic");
	}

	public void setGcPic(String gcPic) {
		this.set("gcPic", gcPic);
	}

	private Long typeId;

	public Long getTypeId() {
		return this.getLong("typeId");
	}

	public void setTypeId(Long typeId) {
		this.set("typeId", typeId);
	}

	private String typeName;

	public String getTypeName() {
		return this.getString("typeName");
	}

	public void setTypeName(String typeName) {
		this.set("typeName", typeName);
	}

	private Long gcParentId;

	public Long getGcParentId() {
		return this.getLong("gcParentId");
	}

	public void setGcParentId(Long gcParentId) {
		this.set("gcParentId", gcParentId);
	}

	private Long gcSort;

	public Long getGcSort() {
		return this.getLong("gcSort");
	}

	public void setGcSort(Long gcSort) {
		this.set("gcSort", gcSort);
	}

	private Integer gcShow;

	public Integer getGcShow() {
		return this.getInteger("gcShow");
	}

	public void setGcShow(Integer gcShow) {
		this.set("gcShow", gcShow);
	}

	private String gcTitle;

	public String getGcTitle() {
		return this.getString("gcTitle");
	}

	public void setGcTitle(String gcTitle) {
		this.set("gcTitle", gcTitle);
	}

	private String gcKeywords;

	public String getGcKeywords() {
		return this.getString("gcKeywords");
	}

	public void setGcKeywords(String gcKeywords) {
		this.set("gcKeywords", gcKeywords);
	}

	private String gcDescription;

	public String getGcDescription() {
		return this.getString("gcDescription");
	}

	public void setGcDescription(String gcDescription) {
		this.set("gcDescription", gcDescription);
	}

	private String gcIdpath;

	public String getGcIdpath() {
		return this.getString("gcIdpath");
	}

	public void setGcIdpath(String gcIdpath) {
		this.set("gcIdpath", gcIdpath);
	}

	private Long expenScale;

	public Long getExpenScale() {
		return this.getLong("expenScale");
	}

	public void setExpenScale(Long expenScale) {
		this.set("expenScale", expenScale);
	}

	private Integer isRelate;

	public Integer getIsRelate() {
		return this.getInteger("isRelate");
	}

	public void setIsRelate(Integer isRelate) {
		this.set("isRelate", isRelate);
	}

}
