//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsClassTag;

/**
 * 
 * @author
 */

public interface GoodsClassTagService extends BaseService<GoodsClassTag>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsClassTag
	 * @return
	 */
	public int saveGoodsClassTag(GoodsClassTag GoodsClassTag) ;
	/**
	 * 删除
	* @param GoodsClassTag
	* @return
	 */
	public int deleteGoodsClassTag(GoodsClassTag GoodsClassTag);


}
