//Powered By if, Since 2014 - 2020

package com.zsCat.web.sys.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.zsCat.common.base.BaseEntity;


/**
 * 
 * @author 
 */

@SuppressWarnings({ "unused"})
@Table(name="sys_area")
public class SysArea extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
    private String code; //code <区域编码>

    private String name; //name <区域名称>

    private Long parentId; //parent_id <父级编号>

    private String parentIds; //parent_ids <所有父级编号>

    private String remarks; //remarks <备注信息>

    private String type; //type <区域类型>
    
    private String icon; //icon <图标>
    
    private String updateBy; //update_by <更新者>
	private Date updateDate; //update_date <更新时间>
	private String createBy; //create_by <创建者>
	private Date createDate; //create_date <创建时间>
	private String delFlag; //del_flag <删除标记(0.正常  1.删除)>

    @Transient
    private String oldParentIds; //旧的pids,非表中字段，用作更新用

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getOldParentIds() {
		return oldParentIds;
	}

	public void setOldParentIds(String oldParentIds) {
		this.oldParentIds = oldParentIds;
	}

	
}
