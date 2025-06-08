//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.github.pagehelper.PageInfo;
import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Favorites;
import com.zsCat.web.goods.model.Goods;

/**
 * 
 * @author
 */

public interface GoodsService extends BaseService<Goods>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Goods
	 * @return
	 */
	public int saveGoods(Goods Goods) ;
	/**
	 * 删除
	* @param Goods
	* @return
	 */
	public int deleteGoods(Goods Goods);
	public PageInfo<Goods> selectFavoritePageInfo(int i, int j, Favorites fa);


}
