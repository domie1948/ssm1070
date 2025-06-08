//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsWords;

/**
 * 
 * @author
 */

public interface GoodsWordsService extends BaseService<GoodsWords>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsWords
	 * @return
	 */
	public int saveGoodsWords(GoodsWords GoodsWords) ;
	/**
	 * 删除
	* @param GoodsWords
	* @return
	 */
	public int deleteGoodsWords(GoodsWords GoodsWords);


}
