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
 * @author zsCat 2016-11-2 17:13:42
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	优惠劵管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_favorites")
public class Favorites extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private Long favId;
public Long getFavId() {return this.getLong("favId");}
public void setFavId(Long favId) {this.set("favId",favId);}
private String favType;
public String getFavType() {return this.getString("favType");}
public void setFavType(String favType) {this.set("favType",favType);}
private Long favTime;
public Long getFavTime() {return this.getLong("favTime");}
public void setFavTime(Long favTime) {this.set("favTime",favTime);}
private Long memberId;
public Long getMemberId() {return this.getLong("memberId");}
public void setMemberId(Long memberId) {this.set("memberId",memberId);}


}
