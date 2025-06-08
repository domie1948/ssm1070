//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.test.model;

import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Transient;
import com.zsCat.common.base.BaseEntity;


/**
 * 
 * @author zsCat 2016-11-8 10:01:39
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	test管理
 */
@SuppressWarnings({ "unused"})
@Table(name="test_tree")
public class TestTree extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String name;
public String getName() {return this.getString("name");}
public void setName(String name) {this.set("name",name);}
private Long parentId;
public Long getParentId() {return this.getLong("parentId");}
public void setParentId(Long parentId) {this.set("parentId",parentId);}
private String parentIds;
public String getParentIds() {return this.getString("parentIds");}
public void setParentIds(String parentIds) {this.set("parentIds",parentIds);}
@Transient
private String oldParentIds; //旧的pids,非表中字段，用作更新用
public String getOldParentIds() { return this.getString("oldParentIds"); }
 public void setOldParentIds(String oldParentIds) { this.set("oldParentIds", oldParentIds); }


}
