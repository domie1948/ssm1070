//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Favorites;

/**
 * 
 * @author
 */

public interface FavoritesService extends BaseService<Favorites>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Favorites
	 * @return
	 */
	public int saveFavorites(Favorites Favorites) ;
	/**
	 * 删除
	* @param Favorites
	* @return
	 */
	public int deleteFavorites(Favorites Favorites);


}
