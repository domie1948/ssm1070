//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.ShopType;

/**
 * 
 * @author
 */

public interface ShopTypeService extends BaseService<ShopType>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param ShopType
	 * @return
	 */
	public int saveShopType(ShopType ShopType) ;
	/**
	 * 删除
	* @param ShopType
	* @return
	 */
	public int deleteShopType(ShopType ShopType);
	public PageInfo<ShopType> findPageInfo(Map<String, Object> params);


}
