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
 * @author zsCat 2016-10-31 14:05:53
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
@SuppressWarnings({ "unused"})
@Table(name="shop_goods")
public class Goods extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String goodsName;
public String getGoodsName() {return this.getString("goodsName");}
public void setGoodsName(String goodsName) {this.set("goodsName",goodsName);}
private String goodsSubtitle;
public String getGoodsSubtitle() {return this.getString("goodsSubtitle");}
public void setGoodsSubtitle(String goodsSubtitle) {this.set("goodsSubtitle",goodsSubtitle);}
private Long gcId;
public Long getGcId() {return this.getLong("gcId");}
public void setGcId(Long gcId) {this.set("gcId",gcId);}
private String gcName;
public String getGcName() {return this.getString("gcName");}
public void setGcName(String gcName) {this.set("gcName",gcName);}
private Long brandId;
public Long getBrandId() {return this.getLong("brandId");}
public void setBrandId(Long brandId) {this.set("brandId",brandId);}
private String brandName;
public String getBrandName() {return this.getString("brandName");}
public void setBrandName(String brandName) {this.set("brandName",brandName);}
private Long typeId;
public Long getTypeId() {return this.getLong("typeId");}
public void setTypeId(Long typeId) {this.set("typeId",typeId);}
private Long storeId;
public Long getStoreId() {return this.getLong("storeId");}
public void setStoreId(Long storeId) {this.set("storeId",storeId);}
private String storeName;
public String getStoreName() {return this.getString("storeName");}
public void setStoreName(String storeName) {this.set("storeName",storeName);}
private Integer specOpen;
public Integer getSpecOpen() {return this.getInteger("specOpen");}
public void setSpecOpen(Integer specOpen) {this.set("specOpen",specOpen);}
private Integer specId;
public Integer getSpecId() {return this.getInteger("specId");}
public void setSpecId(Integer specId) {this.set("specId",specId);}
private String specName;
public String getSpecName() {return this.getString("specName");}
public void setSpecName(String specName) {this.set("specName",specName);}
private String goodsImage;
public String getGoodsImage() {return this.getString("goodsImage");}
public void setGoodsImage(String goodsImage) {this.set("goodsImage",goodsImage);}
private String goodsImageMore;
public String getGoodsImageMore() {return this.getString("goodsImageMore");}
public void setGoodsImageMore(String goodsImageMore) {this.set("goodsImageMore",goodsImageMore);}
private BigDecimal goodsStorePrice;
public BigDecimal getGoodsStorePrice() {return this.getBigDecimal("goodsStorePrice");}
public void setGoodsStorePrice(BigDecimal goodsStorePrice) {this.set("goodsStorePrice",goodsStorePrice);}
private String goodsSerial;
public String getGoodsSerial() {return this.getString("goodsSerial");}
public void setGoodsSerial(String goodsSerial) {this.set("goodsSerial",goodsSerial);}
private Integer goodsShow;
public Integer getGoodsShow() {return this.getInteger("goodsShow");}
public void setGoodsShow(Integer goodsShow) {this.set("goodsShow",goodsShow);}
private Integer goodsClick;
public Integer getGoodsClick() {return this.getInteger("goodsClick");}
public void setGoodsClick(Integer goodsClick) {this.set("goodsClick",goodsClick);}
private Integer goodsState;
public Integer getGoodsState() {return this.getInteger("goodsState");}
public void setGoodsState(Integer goodsState) {this.set("goodsState",goodsState);}
private Integer goodsCommend;
public Integer getGoodsCommend() {return this.getInteger("goodsCommend");}
public void setGoodsCommend(Integer goodsCommend) {this.set("goodsCommend",goodsCommend);}
private Long createTime;
public Long getCreateTime() {return this.getLong("createTime");}
public void setCreateTime(Long createTime) {this.set("createTime",createTime);}
private String goodsKeywords;
public String getGoodsKeywords() {return this.getString("goodsKeywords");}
public void setGoodsKeywords(String goodsKeywords) {this.set("goodsKeywords",goodsKeywords);}
private String goodsDescription;
public String getGoodsDescription() {return this.getString("goodsDescription");}
public void setGoodsDescription(String goodsDescription) {this.set("goodsDescription",goodsDescription);}
private String goodsBody;
public String getGoodsBody() {return this.getString("goodsBody");}
public void setGoodsBody(String goodsBody) {this.set("goodsBody",goodsBody);}
private String goodsAttr;
public String getGoodsAttr() {return this.getString("goodsAttr");}
public void setGoodsAttr(String goodsAttr) {this.set("goodsAttr",goodsAttr);}
private String goodsSpec;
public String getGoodsSpec() {return this.getString("goodsSpec");}
public void setGoodsSpec(String goodsSpec) {this.set("goodsSpec",goodsSpec);}
private String goodsColImg;
public String getGoodsColImg() {return this.getString("goodsColImg");}
public void setGoodsColImg(String goodsColImg) {this.set("goodsColImg",goodsColImg);}
private Long updateTime;
public Long getUpdateTime() {return this.getLong("updateTime");}
public void setUpdateTime(Long updateTime) {this.set("updateTime",updateTime);}
private Long startTime;
public Long getStartTime() {return this.getLong("startTime");}
public void setStartTime(Long startTime) {this.set("startTime",startTime);}
private Long endTime;
public Long getEndTime() {return this.getLong("endTime");}
public void setEndTime(Long endTime) {this.set("endTime",endTime);}
private Long goodsForm;
public Long getGoodsForm() {return this.getLong("goodsForm");}
public void setGoodsForm(Long goodsForm) {this.set("goodsForm",goodsForm);}
private Long transportId;
public Long getTransportId() {return this.getLong("transportId");}
public void setTransportId(Long transportId) {this.set("transportId",transportId);}
private BigDecimal pyPrice;
public BigDecimal getPyPrice() {return this.getBigDecimal("pyPrice");}
public void setPyPrice(BigDecimal pyPrice) {this.set("pyPrice",pyPrice);}
private BigDecimal kdPrice;
public BigDecimal getKdPrice() {return this.getBigDecimal("kdPrice");}
public void setKdPrice(BigDecimal kdPrice) {this.set("kdPrice",kdPrice);}
private BigDecimal esPrice;
public BigDecimal getEsPrice() {return this.getBigDecimal("esPrice");}
public void setEsPrice(BigDecimal esPrice) {this.set("esPrice",esPrice);}
private Long cityId;
public Long getCityId() {return this.getLong("cityId");}
public void setCityId(Long cityId) {this.set("cityId",cityId);}
private String cityName;
public String getCityName() {return this.getString("cityName");}
public void setCityName(String cityName) {this.set("cityName",cityName);}
private Long provinceId;
public Long getProvinceId() {return this.getLong("provinceId");}
public void setProvinceId(Long provinceId) {this.set("provinceId",provinceId);}
private String provinceName;
public String getProvinceName() {return this.getString("provinceName");}
public void setProvinceName(String provinceName) {this.set("provinceName",provinceName);}
private String goodsCloseReason;
public String getGoodsCloseReason() {return this.getString("goodsCloseReason");}
public void setGoodsCloseReason(String goodsCloseReason) {this.set("goodsCloseReason",goodsCloseReason);}
private Integer goodsStoreState;
public Integer getGoodsStoreState() {return this.getInteger("goodsStoreState");}
public void setGoodsStoreState(Integer goodsStoreState) {this.set("goodsStoreState",goodsStoreState);}
private Long commentnum;
public Long getCommentnum() {return this.getLong("commentnum");}
public void setCommentnum(Long commentnum) {this.set("commentnum",commentnum);}
private Long salenum;
public Long getSalenum() {return this.getLong("salenum");}
public void setSalenum(Long salenum) {this.set("salenum",salenum);}
private Long goodsCollect;
public Long getGoodsCollect() {return this.getLong("goodsCollect");}
public void setGoodsCollect(Long goodsCollect) {this.set("goodsCollect",goodsCollect);}
private Long goodsTransfeeCharge;
public Long getGoodsTransfeeCharge() {return this.getLong("goodsTransfeeCharge");}
public void setGoodsTransfeeCharge(Long goodsTransfeeCharge) {this.set("goodsTransfeeCharge",goodsTransfeeCharge);}
private Integer storeClassId;
public Integer getStoreClassId() {return this.getInteger("storeClassId");}
public void setStoreClassId(Integer storeClassId) {this.set("storeClassId",storeClassId);}
private Integer isDel;
public Integer getIsDel() {return this.getInteger("isDel");}
public void setIsDel(Integer isDel) {this.set("isDel",isDel);}
private BigDecimal goodsMarketPrice;
public BigDecimal getGoodsMarketPrice() {return this.getBigDecimal("goodsMarketPrice");}
public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {this.set("goodsMarketPrice",goodsMarketPrice);}
private BigDecimal goodsCostPrice;
public BigDecimal getGoodsCostPrice() {return this.getBigDecimal("goodsCostPrice");}
public void setGoodsCostPrice(BigDecimal goodsCostPrice) {this.set("goodsCostPrice",goodsCostPrice);}


}
