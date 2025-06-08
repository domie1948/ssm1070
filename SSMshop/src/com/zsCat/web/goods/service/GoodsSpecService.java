//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsSpec;

/**
 * 
 * @author
 */

public interface GoodsSpecService extends BaseService<GoodsSpec>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsSpec
	 * @return
	 */
	public int saveGoodsSpec(GoodsSpec GoodsSpec) ;
	/**
	 * 删除
	* @param GoodsSpec
	* @return
	 */
	public int deleteGoodsSpec(GoodsSpec GoodsSpec);


}
