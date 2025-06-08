//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.goods.model.GoodsImages;

/**
 * 
 * @author
 */

public interface GoodsImagesService extends BaseService<GoodsImages>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsImages
	 * @return
	 */
	public int saveGoodsImages(GoodsImages GoodsImages) ;
	/**
	 * 删除
	* @param GoodsImages
	* @return
	 */
	public int deleteGoodsImages(GoodsImages GoodsImages);


}
