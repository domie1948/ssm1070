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
 * @author zsCat 2016-10-31 14:07:34
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods_common")
public class GoodsCommon extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String goodsName;
public String getGoodsName() {return this.getString("goodsName");}
public void setGoodsName(String goodsName) {this.set("goodsName",goodsName);}
private String goodsJingle;
public String getGoodsJingle() {return this.getString("goodsJingle");}
public void setGoodsJingle(String goodsJingle) {this.set("goodsJingle",goodsJingle);}
private Long gcId;
public Long getGcId() {return this.getLong("gcId");}
public void setGcId(Long gcId) {this.set("gcId",gcId);}
private String gcName;
public String getGcName() {return this.getString("gcName");}
public void setGcName(String gcName) {this.set("gcName",gcName);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private String storeName;
public String getStoreName() {return this.getString("storeName");}
public void setStoreName(String storeName) {this.set("storeName",storeName);}
private String specName;
public String getSpecName() {return this.getString("specName");}
public void setSpecName(String specName) {this.set("specName",specName);}
private String specValue;
public String getSpecValue() {return this.getString("specValue");}
public void setSpecValue(String specValue) {this.set("specValue",specValue);}
private Long brandId;
public Long getBrandId() {return this.getLong("brandId");}
public void setBrandId(Long brandId) {this.set("brandId",brandId);}
private String brandName;
public String getBrandName() {return this.getString("brandName");}
public void setBrandName(String brandName) {this.set("brandName",brandName);}
private Long typeId;
public Long getTypeId() {return this.getLong("typeId");}
public void setTypeId(Long typeId) {this.set("typeId",typeId);}
private String goodsImage;
public String getGoodsImage() {return this.getString("goodsImage");}
public void setGoodsImage(String goodsImage) {this.set("goodsImage",goodsImage);}
private String goodsAttr;
public String getGoodsAttr() {return this.getString("goodsAttr");}
public void setGoodsAttr(String goodsAttr) {this.set("goodsAttr",goodsAttr);}
private String goodsBody;
public String getGoodsBody() {return this.getString("goodsBody");}
public void setGoodsBody(String goodsBody) {this.set("goodsBody",goodsBody);}
private Long goodsState;
public Long getGoodsState() {return this.getLong("goodsState");}
public void setGoodsState(Long goodsState) {this.set("goodsState",goodsState);}
private String goodsStateremark;
public String getGoodsStateremark() {return this.getString("goodsStateremark");}
public void setGoodsStateremark(String goodsStateremark) {this.set("goodsStateremark",goodsStateremark);}
private Long goodsVerify;
public Long getGoodsVerify() {return this.getLong("goodsVerify");}
public void setGoodsVerify(Long goodsVerify) {this.set("goodsVerify",goodsVerify);}
private String goodsVerifyremark;
public String getGoodsVerifyremark() {return this.getString("goodsVerifyremark");}
public void setGoodsVerifyremark(String goodsVerifyremark) {this.set("goodsVerifyremark",goodsVerifyremark);}
private Long goodsLock;
public Long getGoodsLock() {return this.getLong("goodsLock");}
public void setGoodsLock(Long goodsLock) {this.set("goodsLock",goodsLock);}
private Long goodsAddtime;
public Long getGoodsAddtime() {return this.getLong("goodsAddtime");}
public void setGoodsAddtime(Long goodsAddtime) {this.set("goodsAddtime",goodsAddtime);}
private Long goodsSelltime;
public Long getGoodsSelltime() {return this.getLong("goodsSelltime");}
public void setGoodsSelltime(Long goodsSelltime) {this.set("goodsSelltime",goodsSelltime);}
private String goodsSpecname;
public String getGoodsSpecname() {return this.getString("goodsSpecname");}
public void setGoodsSpecname(String goodsSpecname) {this.set("goodsSpecname",goodsSpecname);}
private BigDecimal goodsPrice;
public BigDecimal getGoodsPrice() {return this.getBigDecimal("goodsPrice");}
public void setGoodsPrice(BigDecimal goodsPrice) {this.set("goodsPrice",goodsPrice);}
private BigDecimal goodsMarketprice;
public BigDecimal getGoodsMarketprice() {return this.getBigDecimal("goodsMarketprice");}
public void setGoodsMarketprice(BigDecimal goodsMarketprice) {this.set("goodsMarketprice",goodsMarketprice);}
private BigDecimal goodsCostprice;
public BigDecimal getGoodsCostprice() {return this.getBigDecimal("goodsCostprice");}
public void setGoodsCostprice(BigDecimal goodsCostprice) {this.set("goodsCostprice",goodsCostprice);}
private Long goodsDiscount;
public Long getGoodsDiscount() {return this.getLong("goodsDiscount");}
public void setGoodsDiscount(Long goodsDiscount) {this.set("goodsDiscount",goodsDiscount);}
private String goodsSerial;
public String getGoodsSerial() {return this.getString("goodsSerial");}
public void setGoodsSerial(String goodsSerial) {this.set("goodsSerial",goodsSerial);}
private Long transportId;
public Long getTransportId() {return this.getLong("transportId");}
public void setTransportId(Long transportId) {this.set("transportId",transportId);}
private String transportTitle;
public String getTransportTitle() {return this.getString("transportTitle");}
public void setTransportTitle(String transportTitle) {this.set("transportTitle",transportTitle);}
private Long goodsCommend;
public Long getGoodsCommend() {return this.getLong("goodsCommend");}
public void setGoodsCommend(Long goodsCommend) {this.set("goodsCommend",goodsCommend);}
private Long goodsFreight;
public Long getGoodsFreight() {return this.getLong("goodsFreight");}
public void setGoodsFreight(Long goodsFreight) {this.set("goodsFreight",goodsFreight);}
private Long goodsVat;
public Long getGoodsVat() {return this.getLong("goodsVat");}
public void setGoodsVat(Long goodsVat) {this.set("goodsVat",goodsVat);}
private Long areaid1;
public Long getAreaid1() {return this.getLong("areaid1");}
public void setAreaid1(Long areaid1) {this.set("areaid1",areaid1);}
private Long areaid2;
public Long getAreaid2() {return this.getLong("areaid2");}
public void setAreaid2(Long areaid2) {this.set("areaid2",areaid2);}
private String goodsStcids;
public String getGoodsStcids() {return this.getString("goodsStcids");}
public void setGoodsStcids(String goodsStcids) {this.set("goodsStcids",goodsStcids);}
private Long plateidTop;
public Long getPlateidTop() {return this.getLong("plateidTop");}
public void setPlateidTop(Long plateidTop) {this.set("plateidTop",plateidTop);}
private Long plateidBottom;
public Long getPlateidBottom() {return this.getLong("plateidBottom");}
public void setPlateidBottom(Long plateidBottom) {this.set("plateidBottom",plateidBottom);}
private Integer isDel;
public Integer getIsDel() {return this.getInteger("isDel");}
public void setIsDel(Integer isDel) {this.set("isDel",isDel);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}


}
