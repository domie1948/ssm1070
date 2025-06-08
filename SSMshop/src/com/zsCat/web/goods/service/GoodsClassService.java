//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsClass;

/**
 * 
 * @author
 */

public interface GoodsClassService extends BaseService<GoodsClass>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsClass
	 * @return
	 */
	public int saveGoodsClass(GoodsClass GoodsClass) ;
	/**
	 * 删除
	* @param GoodsClass
	* @return
	 */
	public int deleteGoodsClass(GoodsClass GoodsClass);


}
