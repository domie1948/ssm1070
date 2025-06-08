package com.zsCat.web.goods.util;



/**
 * 2016年06月29日17:58:33
 * @author lza
 * 这个实体类不用于存数据
 */

public class GoodsSpecVo {
	/**
	 * 规格id
	 */
	private Integer spId;
	/**
	 * 规格名称
	 */
	private String spName;
	/**
	 * 规格值id
	 */
	private Integer spValueId;
	/**
	 * 规格值名称
	 */
	private String spValueName;
	
	/**
	 * 对应的图片
	 */
	private String colImg;
	
	/**
	 * 商品规格是否开启
	 */
	private Integer specIsOpen;

	public Integer getSpId() {
		return spId;
	}

	public void setSpId(Integer spId) {
		this.spId = spId;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public Integer getSpValueId() {
		return spValueId;
	}

	public void setSpValueId(Integer spValueId) {
		this.spValueId = spValueId;
	}

	public String getSpValueName() {
		return spValueName;
	}

	public void setSpValueName(String spValueName) {
		this.spValueName = spValueName;
	}

	public String getColImg() {
		return colImg;
	}

	public void setColImg(String colImg) {
		this.colImg = colImg;
	}

	public Integer getSpecIsOpen() {
		return specIsOpen;
	}

	public void setSpecIsOpen(Integer specIsOpen) {
		this.specIsOpen = specIsOpen;
	}
	
	
}
