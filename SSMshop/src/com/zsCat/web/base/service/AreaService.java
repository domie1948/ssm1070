//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Area;

/**
 * 
 * @author
 */

public interface AreaService extends BaseService<Area>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Area
	 * @return
	 */
	public int saveArea(Area Area) ;
	/**
	 * 删除
	* @param Area
	* @return
	 */
	public int deleteArea(Area Area);


}
