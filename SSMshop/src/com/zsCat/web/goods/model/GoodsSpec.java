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
 * @author zsCat 2016-10-31 14:08:16
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods_spec")
public class GoodsSpec extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 所有规格值id以逗号分隔
	 */
	@Transient
	private String specValueIdStr;
	public String getSpecValueIdStr() {return this.getString("specValueIdStr");}
	public void setSpecValueIdStr(String specValueIdStr) {this.set("specValueIdStr",specValueIdStr);}
  		 private Long goodsId;
public Long getGoodsId() {return this.getLong("goodsId");}
public void setGoodsId(Long goodsId) {this.set("goodsId",goodsId);}
private String specName;
public String getSpecName() {return this.getString("specName");}
public void setSpecName(String specName) {this.set("specName",specName);}
private BigDecimal specGoodsPrice;
public BigDecimal getSpecGoodsPrice() {return this.getBigDecimal("specGoodsPrice");}
public void setSpecGoodsPrice(BigDecimal specGoodsPrice) {this.set("specGoodsPrice",specGoodsPrice);}
private Long specGoodsStorage;
public Long getSpecGoodsStorage() {return this.getLong("specGoodsStorage");}
public void setSpecGoodsStorage(Long specGoodsStorage) {this.set("specGoodsStorage",specGoodsStorage);}
private Integer specSalenum;
public Integer getSpecSalenum() {return this.getInteger("specSalenum");}
public void setSpecSalenum(Integer specSalenum) {this.set("specSalenum",specSalenum);}
private String specGoodsColor;
public String getSpecGoodsColor() {return this.getString("specGoodsColor");}
public void setSpecGoodsColor(String specGoodsColor) {this.set("specGoodsColor",specGoodsColor);}
private String specGoodsSerial;
public String getSpecGoodsSerial() {return this.getString("specGoodsSerial");}
public void setSpecGoodsSerial(String specGoodsSerial) {this.set("specGoodsSerial",specGoodsSerial);}
private String specGoodsSpec;
public String getSpecGoodsSpec() {return this.getString("specGoodsSpec");}
public void setSpecGoodsSpec(String specGoodsSpec) {this.set("specGoodsSpec",specGoodsSpec);}
private Integer specIsopen;
public Integer getSpecIsopen() {return this.getInteger("specIsopen");}
public void setSpecIsopen(Integer specIsopen) {this.set("specIsopen",specIsopen);}


}
