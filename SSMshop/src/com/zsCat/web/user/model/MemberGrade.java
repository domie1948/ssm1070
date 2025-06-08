//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.model;

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
 * @author zsCat 2016-11-1 9:36:52
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	会员管理管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_member_grade")
public class MemberGrade extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String gradeName;
public String getGradeName() {return this.getString("gradeName");}
public void setGradeName(String gradeName) {this.set("gradeName",gradeName);}
private Integer integration;
public Integer getIntegration() {return this.getInteger("integration");}
public void setIntegration(Integer integration) {this.set("integration",integration);}
private String gradeImg;
public String getGradeImg() {return this.getString("gradeImg");}
public void setGradeImg(String gradeImg) {this.set("gradeImg",gradeImg);}
private Integer preferential;
public Integer getPreferential() {return this.getInteger("preferential");}
public void setPreferential(Integer preferential) {this.set("preferential",preferential);}
private Integer isDefault;
public Integer getIsDefault() {return this.getInteger("isDefault");}
public void setIsDefault(Integer isDefault) {this.set("isDefault",isDefault);}


}
