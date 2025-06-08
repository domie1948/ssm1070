//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsCommon;

/**
 * 
 * @author
 */

public interface GoodsCommonService extends BaseService<GoodsCommon>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsCommon
	 * @return
	 */
	public int saveGoodsCommon(GoodsCommon GoodsCommon) ;
	/**
	 * 删除
	* @param GoodsCommon
	* @return
	 */
	public int deleteGoodsCommon(GoodsCommon GoodsCommon);


}
